SUMMARY = "MathGL wxWidgets library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-wx8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "2e86d9478e5355b5dfdd17f0da787f26e3c315207454d466a78fb4df16791191d374d4fc7c52cce83b109d319d5d1ddc6eaeee3bb72c445e30b52fd57f477420"

RPROVIDES:${PN} += "libmgl-wx.so.8()(64bit) \
libmgl-wx8 \
libmgl-wx8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmgl.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.8.0.0()(64bit) \
libwx_gtk3u_core-suse.so.8.0.0()(64bit)"

inherit rpm
