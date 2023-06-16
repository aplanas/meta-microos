SUMMARY = "A multilingual input method framework"
DESCRIPTION = "Uim is a multilingual input method framework."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "06dbc336846b6d1cb0d109fc96254d203e35ee18563bb8990fee64c5ffe16ca5a4183f45d74bc5b5e429d9cb711caee1837e3729a1f9742335fc1c9416e83b36"

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
