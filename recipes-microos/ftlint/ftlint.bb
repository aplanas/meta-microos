SUMMARY = "Simple font tester"
DESCRIPTION = "Simple font tester \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftlint-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "a5d1ac1ef72430dfe13e43cf1c294e570342cd2d48fd8c182824b555c386a745b99c37bb109fb511486ffc41ca3559c1eb7254f347dbb9b7480e90cf8d1076e1"

RPROVIDES:${PN} += "ftlint ftlint(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit)"

inherit rpm
