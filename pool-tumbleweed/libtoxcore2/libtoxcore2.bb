SUMMARY = "Core library for toxcore"
DESCRIPTION = "This are the Core library for toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "libtoxcore2-0.2.18-1.5.aarch64.rpm"
RPM_HASH = "fa877177356840f2a49be0e06013534a02d25ff80fd5e5315bd5ae87b7963187b7472e5b16e89008afe9da403a2ae04d4bd27f3d5830b283cd4f3bda9f12e10c"

RPROVIDES:${PN} += "libtoxcore.so.2 \
libtoxcore2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libopus.so.0 \
libsodium.so.23 \
libvpx.so.8"

inherit rpm
