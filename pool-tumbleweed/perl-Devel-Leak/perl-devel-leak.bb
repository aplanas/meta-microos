SUMMARY = "Utility for looking for perl objects that are not reclaimed"
DESCRIPTION = " \
 Devel-Leak module for perl \
  Devel::Leak has two functions NoteSV and CheckSV. \
  NoteSV walks the perl internal table of allocated SVs (scalar values) \
   - (which actually contains arrays and hashes too), \
   and records their addresses in a table. It returns a count of these 'things', \
   and stores a pointer to the table (which is obtained from the heap \
   using malloc()) in its argument. \
  CheckSV is passed argument which holds a pointer to a table created by NoteSV. \
   It re-walks the perl-internals and calls sv_dump() for any 'things' \
   which did not exist when NoteSV was called. \
   It returns a count of the number of 'things' now allocated. \
  Author:	Nick Ing-Simmons <nick@ni-s.u-net.com>"
LICENSE = "GPL-1.0 | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Devel-Leak-0.03-25.39.aarch64.rpm"
RPM_HASH = "496d1aa5855df4ae4a97a14a52d42b4ca193854e16c5f5896652a39129f6aedaae715ea254f0a4825aa540cdc67cfc2835660079b79e180836c0056351a27151"

RPROVIDES:${PN} += "perl-Devel--Leak \
perl-Devel-Leak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
