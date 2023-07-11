SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "VFS functionality for GLib. \
This package contains all necessary backend files and libraries."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-backends-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "6b5f26c91d7f7efc3d7a622bb931ed3dfb35496e94156000df3809b91f8a2190553cb119b076c20e9ed3a98cbc5034b7c06ced9ad77f97694bf781156c99ca3c"

RPROVIDES:${PN} += "gvfs-backends"

RDEPENDS:${PN} += "/usr/bin/sh \
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
