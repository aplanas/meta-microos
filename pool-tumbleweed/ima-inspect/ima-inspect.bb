SUMMARY = "Output IMA/EVM extended attributes in a human readable format"
DESCRIPTION = "This is a small utility that supplements ima-evm-utils with a way to inspect \
the security.ima and security.evm extended attributes in human readable \
format."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15"

RPM_NAME = "ima-inspect-0.15-1.2.aarch64.rpm"
RPM_HASH = "236716c814dc8ac465a8a71a7b6d54430fed5e5b2d93a275e3deb2cb7e2bcce363534b415d9eee98352c1ef9440804674ef4514eb459c193548eb1307c4b2ebb"

RPROVIDES:${PN} += "ima-inspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
