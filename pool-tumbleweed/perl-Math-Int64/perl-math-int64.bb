SUMMARY = "Manipulate 64 bits integers in Perl"
DESCRIPTION = "This module adds support for 64 bit integers, signed and unsigned, to Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.54"

RPM_NAME = "perl-Math-Int64-0.54-1.18.aarch64.rpm"
RPM_HASH = "2724f8cfb801652c35f1e233a9707eac271ab7fd2c2483b5bb5cf8a61af5386723e913f653623a71b36f940bc8e6e22f32185536a3fe637bb38aee13de604bb3"

RPROVIDES:${PN} += "perl-Math--Int64 \
perl-Math--Int64--die-on-overflow \
perl-Math--Int64--native-if-available \
perl-Math--UInt64 \
perl-Math-Int64"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-base"

inherit rpm
