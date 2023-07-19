SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230602.89901a92"

RPM_NAME = "rpmlint-mini-2.4.0+git20230602.89901a92-11.16.aarch64.rpm"
RPM_HASH = "aaaab5b1dd6e27361e9c79042d3aedfd29ad24244016597b6a3b06eb4207a26079de779cfef322e7509c8111b97ec31e1eac082cf1ef0d6ea0749ee3e114abd9"

RPROVIDES:${PN} += "rpmlint-mini"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
cpio \
ld-linux-aarch64.so.1 \
polkit-default-privs"

inherit rpm
