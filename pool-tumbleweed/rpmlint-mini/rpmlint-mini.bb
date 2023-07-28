SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230713.dfa31c7"

RPM_NAME = "rpmlint-mini-2.4.0+git20230713.dfa31c7-12.1.aarch64.rpm"
RPM_HASH = "6f1fc967136855700b6cff75ee9bef06b917179d6c4f86c5223093e985839fce0298b4e922e600b9648c5dad41fc94e1363fd3f32480ddaceb6d141c04918f59"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
