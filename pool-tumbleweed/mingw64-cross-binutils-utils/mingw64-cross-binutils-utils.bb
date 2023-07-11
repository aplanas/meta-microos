SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw64-cross-binutils-utils-2.39-4.4.aarch64.rpm"
RPM_HASH = "f1e87e9eb9790538f7d9d32e449df67f418bcfefb7657d71bc21d2276b87297d84c845ac8e5fdd2ad80fd931cd9a135ec9de212cef41c65ca6fcb9f22bdbedd6"

RPROVIDES:${PN} += "mingw64-cross-binutils-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
