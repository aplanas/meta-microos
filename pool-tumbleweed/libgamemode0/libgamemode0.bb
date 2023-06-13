SUMMARY = "GameMode client library"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
Libgamemode is the client library used by games or libgamemodeauto to \
talk to the GameMode daemon."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemode0-1.7-3.1.aarch64.rpm"
RPM_HASH = "8f4f8bc405ab443709282b9a7e5b046185b307cd12c967c0d0d7f561b5dd6233c60fa08c75fe2c3a2339728cbf80849a912dc8c41adc704353e6265d7b84578b"

RPROVIDES:${PN} += "libgamemode.so.0()(64bit) \
libgamemode0 \
libgamemode0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gamemoded \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
systemd"

inherit rpm
