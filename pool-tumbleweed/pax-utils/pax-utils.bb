SUMMARY = "Tools to Check ELF Files for Security Relevant Properties"
DESCRIPTION = "Tools to check ELF files for security relevant properties such as \
non-executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "pax-utils-1.3.7-2.1.aarch64.rpm"
RPM_HASH = "a18b3f86dedfbccfd01465137c8c713312cc48a3f2d3fefec44ed22c44aad951d8770d19c5d9abfb49c53800efe8db102ebd35f5fd85187f3168dde023595925"

RPROVIDES:${PN} += "pax-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
