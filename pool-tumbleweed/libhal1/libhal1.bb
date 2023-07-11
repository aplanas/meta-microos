SUMMARY = "Shared library for Flash hardware identification"
DESCRIPTION = "The Flash plugin currently requires libhal for playback of drm content. \
 \
This library provides a compatibility layer and minimal libhal implementation for that purpose. \
This library does NOT provide a full HAL interface or daemon."
LICENSE = "GPL-2.0+ | AFL-2.1"

PV = "0.3.3"

RPM_NAME = "libhal1-0.3.3-1.27.aarch64.rpm"
RPM_HASH = "1b4fe8a29dc3394091ce170ce98f97b4f2d2a2bacd0a07b1c8e08dd1a4981f006287df857b76c0e43734282600442e5d52be15b676d4345bde46e5841e285b57"

RPROVIDES:${PN} += "hal-flash \
libhal.so.1 \
libhal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
