SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "VFS functionality for GLib. \
This package contains all necessary backend files and libraries."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backends-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "624d00102796bfbf028d59af64d0b8f9eeed2d61df24535e60490438438fe2c4540218de7e5c8ea1e5f4aa88da0b8a588aea9cf5e4a303edb62bd7b182f729f2"

RPROVIDES:${PN} += "gvfs-backends \
gvfs-backends(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gvfs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libbluray.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) \
libcdio_paranoia.so.2()(64bit) \
libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libgudev-1.0.so.0()(64bit) \
libgvfscommon.so()(64bit) \
libgvfsdaemon.so()(64bit) \
libmtp.so.9()(64bit) \
libnfs.so.14()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudisks2.so.0()(64bit) \
libusb-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
permissions"

inherit rpm
