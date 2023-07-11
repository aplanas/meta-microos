SUMMARY = "The Weston compositor as a shared library"
DESCRIPTION = "The libweston library is intended for use by other compositor efforts \
(projects) that want to more easily utilize Weston's internal \
functionalities. Weston's own reference compositor also makes use of \
this."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "libweston-12-0-12.0.1-1.2.aarch64.rpm"
RPM_HASH = "455390c9c97007578d60c139f1fda19e0a13fbb340dd09c46948b25a6a9e11ff4ac45add71b1a7dd64ed9f825f6bf76d04d41da2540fabe5773977aa8063c5d8"

RPROVIDES:${PN} += "libweston-12-0 \
libweston-12.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libpixman-1.so.0 \
libwayland-server.so.0 \
libweston-12 \
libxkbcommon.so.0"

inherit rpm
