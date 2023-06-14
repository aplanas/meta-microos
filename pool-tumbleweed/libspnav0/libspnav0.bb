SUMMARY = "Library for accessing 3D connexion devices"
DESCRIPTION = "The libspnav library is provided as a replacement of the magellan library. \
It provides a cleaner, and more orthogonal interface. libspnav supports \
both the original X11 protocol for communicating with the driver, and the \
new alternative non-X protocol. Programs that choose to use the X11 \
protocol, are automatically compatible with either the free spacenavd \
driver or the official 3dxserv, as if they were using the magellan SDK. \
 \
Also, libspnav provides a magellan API wrapper on top of the new API. So, \
any applications that were using the magellan library, can switch to \
libspnav without any changes. And programmers that are familliar with the \
magellan API can continue using it with a free library without the \
restrictions of the official SDK."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "libspnav0-1.1-1.2.aarch64.rpm"
RPM_HASH = "ac7ed4d774a7e0ddf0050de23542063cf16e788690a7a91184247e380dae51fff7261d4866fe6e64fac9cfc11d721d8dabace3fb375870e459e9d5e7784f146d"

RPROVIDES:${PN} += "libspnav.so.0 \
libspnav0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
