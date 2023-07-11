SUMMARY = "Developer's Help Program for GNOME"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-43.0-2.2.aarch64.rpm"
RPM_HASH = "e6c04d9d3097c0465fc58b014f6563328fd976b8de22a7b3c462ac502fae5110414ed3b529f52178c31ca23d5ebca3d5ef7b28cf0d55beacd99fc7d65ff0dddf"

RPROVIDES:${PN} += "devhelp \
libdevhelp-3.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
