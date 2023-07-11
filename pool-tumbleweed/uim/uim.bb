SUMMARY = "A multilingual input method framework"
DESCRIPTION = "Uim is a multilingual input method framework."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-1.8.8-9.10.aarch64.rpm"
RPM_HASH = "79a1703fc048e27ef7f9a3c63a28d3d1595dc7b63bd55e9b547e2f1e570377c2f6a22ee17659f189cafcb0e83e3c053bea4c5e93eec06e612790ea8d9696220d"

RPROVIDES:${PN} += "libgcroots.so.0 \
libuim-anthy-utf8.so \
libuim-anthy.so \
libuim-custom-enabler.so \
libuim-custom.so.2 \
libuim-editline.so \
libuim-fileio.so \
libuim-lolevel.so \
libuim-look.so \
libuim-m17nlib.so \
libuim-process.so \
libuim-scm.so.0 \
libuim-skk.so \
libuim-socket.so \
libuim-xkb.so \
libuim.so.8 \
uim"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
/usr/bin/touch \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libanthy.so.0 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm17n-core.so.0 \
libm17n.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
