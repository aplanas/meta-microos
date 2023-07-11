SUMMARY = "Install fonts automatically using PackageKit"
DESCRIPTION = "The PackageKit GTK3+ module allows any Pango application to install \
fonts from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gtk3-module-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "076a0d889a67241f0d1f7f8b077db3741923e22f125e58973840915bd449633876ba733f0dfaac9a90b7dcce37e57da3d8f0f6d76470e5e95265b91705342410"

RPROVIDES:${PN} += "PackageKit-gtk3-module \
libpk-gtk-module.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm
