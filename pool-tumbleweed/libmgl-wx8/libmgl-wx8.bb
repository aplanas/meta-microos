SUMMARY = "MathGL wxWidgets library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-wx8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "2332f9391bbcff8004c0d6eb7195581d0c2ec8caa2a0d0f5aa6345944e37cfb6a6ddc95acf0a6480b2dae8cca0078c6a4ab538c7b9f961aeb269b2c929766e79"

RPROVIDES:${PN} += "libmgl-wx.so.8 \
libmgl-wx8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
