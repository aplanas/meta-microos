SUMMARY = "Manipulate 64 bits integers in Perl"
DESCRIPTION = "This module adds support for 64 bit integers, signed and unsigned, to Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-Math-Int64-0.54-1.19.aarch64.rpm"
RPM_HASH = "02f9391934c08c5c9054176c319fcd9d3e996b395aaa82d5d3ea01cb7405e7e5f59a975dc94a1898e2747cebf0de142a924bb7da26272e2bbf896cb2981bdb4e"

RPROVIDES:${PN} += "perl-Math--Int64 \
perl-Math--Int64--die-on-overflow \
perl-Math--Int64--native-if-available \
perl-Math--UInt64 \
perl-Math-Int64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-base"

inherit rpm
