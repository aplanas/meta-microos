SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-mini-2.4.0+git20230818.5cdd21d0-12.11.aarch64.rpm"
RPM_HASH = "b60742ae8bf99779e1ee0ce56c4d58b5c66d00b12a4c1af6cc70eeb657d08643c1cba1f3ba98999d21439aa7d9d47a5f64a462adcb4ed6dedc062d2f5913540b"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
