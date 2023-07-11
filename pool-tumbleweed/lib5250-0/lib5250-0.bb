SUMMARY = "Component library of the tn5250 emulator"
DESCRIPTION = "Component library of the tn5250 emulator."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "lib5250-0-0.16.5-469.7.aarch64.rpm"
RPM_HASH = "3e9d2d6e661105813988503c910f89b9d4f297f1b7ce7e9ac01b2920812b5c5a6d9be9d81651decbf4f8acb70ef1557dbd9924e7219dedc393f6fca00e614d0a"

RPROVIDES:${PN} += "lib5250-0 \
lib5250.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
