SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "VFS functionality for GLib. \
This package contains all necessary backend files and libraries."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backends-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "624d00102796bfbf028d59af64d0b8f9eeed2d61df24535e60490438438fe2c4540218de7e5c8ea1e5f4aa88da0b8a588aea9cf5e4a303edb62bd7b182f729f2"

RPROVIDES:${PN} += "gvfs-backends"

RDEPENDS:${PN} += "/bin/sh \
gvfs \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libbluray.so.2 \
libc.so.6 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgudev-1.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libmtp.so.9 \
libnfs.so.14 \
libpolkit-gobject-1.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsystemd.so.0 \
libudisks2.so.0 \
libusb-1.0.so.0 \
libxml2.so.2 \
permissions"

inherit rpm
