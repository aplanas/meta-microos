SUMMARY = "Themeable window decorator for Compiz"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-0.8.18-2.14.aarch64.rpm"
RPM_HASH = "f7de142cafce94680fae41c2fb26a425c6e6b5ea4ad00f936c1e780f2c2992065168026fce260c11d5aac436c42d24a5bd60638a6914213b915767459be4b661"

RPROVIDES:${PN} += "compiz-decorator \
compiz-emerald \
libemeraldengine.so.0 \
liblegacy.so \
libline.so \
liboxygen.so \
libpixmap.so \
libtruglass.so \
libvrunner.so \
libzootreeves.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libdecoration.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
