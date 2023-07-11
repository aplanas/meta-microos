SUMMARY = "Smart Chinese/Common Input Method platform"
DESCRIPTION = "SCIM is a developing platform to significantly reduce the difficulty of \
input method development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-1.4.18-5.11.aarch64.rpm"
RPM_HASH = "862f484c4ae9b2da3db2ca9e311b04b484dc8f0e03756c4f9d92c0338f04f04830d142dabcc6f5c8bad3de134a18501ac3a3328ccc4bae6fce212d363982e4eb"

RPROVIDES:${PN} += "config-scim \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libscim-x11utils-1.0.so.8 \
rpm-macro--scim-backenddir \
rpm-macro--scim-binary-version \
rpm-macro--scim-bindir \
rpm-macro--scim-datadir \
rpm-macro--scim-enginedir \
rpm-macro--scim-frontenddir \
rpm-macro--scim-helperdir \
rpm-macro--scim-icondir \
rpm-macro--scim-libdir \
rpm-macro--scim-sysconfdir \
rpm-macro--scim-tabledir \
rpm-macro--scim-uidir \
rpm-macro-scim-gtk2-immodule-post \
rpm-macro-scim-gtk2-immodule-postun \
rpm-macro-scim-gtk2-immodule-requires \
scim"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libltdl.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
scim-gtk \
scim-gtk3"

inherit rpm
