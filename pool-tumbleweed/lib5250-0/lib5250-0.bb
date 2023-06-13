SUMMARY = "Component library of the tn5250 emulator"
DESCRIPTION = "Component library of the tn5250 emulator."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "lib5250-0-0.16.5-469.6.aarch64.rpm"
RPM_HASH = "0a336173ca30261123b6a6d9b91df4721a2ffa60df8525c9ee2af738e58c04b63d6bf9609e151c35f7ec9d5528dd71333676ac81e0cdda194b8b717388064c78"

RPROVIDES:${PN} += "lib5250-0 \
lib5250-0(aarch-64) \
lib5250.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
