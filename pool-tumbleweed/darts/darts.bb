SUMMARY = "Double Array Trie System"
DESCRIPTION = "Darts is a simple C++ template library to construct \
Double-Arrays [Aoe 1989]. Double-Arrays are data \
structures to represent Trie. These are faster than \
other Trie implementations. \
 \
Darts is used by Chasen."
LICENSE = "LGPL-2.1+"

PV = "0.32"

RPM_NAME = "darts-0.32-8.27.aarch64.rpm"
RPM_HASH = "56cb9972d590d237a34c4d2b16c492c8f843ee8cef3b8525b3a8aa5bd467ad580e882f8297781d5fe3906f17e36be2e122caaf98fb371735eb29dbfb3677e2bc"

RPROVIDES:${PN} += "darts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
