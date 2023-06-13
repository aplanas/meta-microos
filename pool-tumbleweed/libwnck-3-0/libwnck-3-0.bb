SUMMARY = "Window Navigator Construction Kit (Library Package)"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-3-0-43.0-3.3.aarch64.rpm"
RPM_HASH = "92891604e0ce918db9f708a7b93c4ec16e0965807c23cb6e0641f0144df2028112b9aef6acd984b85f45260d2950cc435a3656a387497220996ceebc16fed221"

RPROVIDES:${PN} += "libwnck \
libwnck-3-0 \
libwnck-3-0(aarch-64) \
libwnck-3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXRes.so.1()(64bit) \
libXrender.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit)"

inherit rpm
