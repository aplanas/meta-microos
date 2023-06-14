SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-cross-binutils-utils-2.39-4.3.aarch64.rpm"
RPM_HASH = "91a273729d0aa589b801e82fddb1ee0a42ceb3656c6feb5a61500e2a0f7b1b5236d2622715a40d6b99e6438c459734aa68c4ebc44324ae604e3983cf3ed72292"

RPROVIDES:${PN} += "mingw64-cross-binutils-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
