SUMMARY = "The Weston compositor as a shared library"
DESCRIPTION = "The libweston library is intended for use by other compositor efforts \
(projects) that want to more easily utilize Weston's internal \
functionalities. Weston's own reference compositor also makes use of \
this."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.2"

RPM_NAME = "libweston-12-0-12.0.2-1.1.aarch64.rpm"
RPM_HASH = "5fa4a608fc9558810370ebb18ece300e1ded74294b9e0de6432c46ef77485f30e3fee1674e3bd54f4b83569396499250ccb996f69cf301170620c87d0582afa0"

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
