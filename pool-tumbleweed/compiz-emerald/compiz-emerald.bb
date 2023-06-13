SUMMARY = "Themeable window decorator for Compiz"
DESCRIPTION = "Emerald is a themeable window decorator for Compiz."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-0.8.18-2.14.aarch64.rpm"
RPM_HASH = "f7de142cafce94680fae41c2fb26a425c6e6b5ea4ad00f936c1e780f2c2992065168026fce260c11d5aac436c42d24a5bd60638a6914213b915767459be4b661"

RPROVIDES:${PN} += "compiz-decorator \
compiz-emerald \
compiz-emerald(aarch-64) \
libemeraldengine.so.0()(64bit) \
liblegacy.so()(64bit) \
libline.so()(64bit) \
liboxygen.so()(64bit) \
libpixmap.so()(64bit) \
libtruglass.so()(64bit) \
libvrunner.so()(64bit) \
libzootreeves.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
compiz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdecoration.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
