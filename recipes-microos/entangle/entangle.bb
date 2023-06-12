SUMMARY = "Tethered shooting & control of digital cameras"
DESCRIPTION = "Entangle is an application which uses GTK and libgphoto2 to provide a \
graphical interface for tethered photography with digital cameras. \
 \
It includes control over camera shooting and configuration settings \
and 'hands off' shooting directly from the controlling computer."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-3.0-2.8.aarch64.rpm"
RPM_HASH = "454a4515fdd6397127f99bd033e74a0857083b46cd76930654fb0fec0132d3bcc141929a62a1f23972715514bc7ed7051a19a8677d425640f996f2cc9deff76f"

RPROVIDES:${PN} += "application() \
application(org.entangle_photo.Manager.desktop) \
entangle \
entangle(aarch-64) \
libentangle_backend.so.0()(64bit) \
libentangle_frontend.so.0()(64bit) \
metainfo() \
metainfo(org.entangle_photo.Manager.metainfo.xml)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgexiv2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgphoto2.so.6()(64bit) \
libgphoto2_port.so.12()(64bit) \
libgphoto2_port.so.12(LIBGPHOTO2_5_0)(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libraw_r.so.23()(64bit)"

inherit rpm
