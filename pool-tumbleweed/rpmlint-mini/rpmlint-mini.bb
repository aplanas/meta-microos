SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-mini-2.4.0+git20230818.5cdd21d0-12.10.aarch64.rpm"
RPM_HASH = "dd62726fde3a79f66dffd8298d3c23fbdcb9597d76a8bc4705420678999c3ba82d22b203f7f1e317f2279a7547e2cf13dc4a0ad9e6209303591a4466d0796ada"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
