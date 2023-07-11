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

RPM_NAME = "perl-Devel-Leak-0.03-25.38.aarch64.rpm"
RPM_HASH = "dbe4ab681362fca785e8b2ddce48aecb86642fb5b0c62e20dc61fc9c94b053f3ac4b96a95b865cbed797750725d1d83a1f691f4774e580be0f65a9ca039bac4a"

RPROVIDES:${PN} += "perl-Devel--Leak \
perl-Devel-Leak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
