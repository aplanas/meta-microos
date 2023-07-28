SUMMARY = "Wnn plugin for mlterm"
DESCRIPTION = "A plugin to use the wnn input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-wnn-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "68caa54ed3b71acd45d08f92bd7ab19bcdca188afd173b16181449ad47b0f5b7d0e328a188cef42291b0d78b3738ed7c4e807a5586e127acc71e6667a22056cf"

RPROVIDES:${PN} += "libim-wnn-sdl2.so \
libim-wnn-wl.so \
libim-wnn.so \
locale-scim-ja;ko;ar;he \
mlterm-wnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjd.so.0 \
libmef.so.3 \
libpobl.so.2"

inherit rpm
