SUMMARY = "Install fonts automatically using PackageKit"
DESCRIPTION = "The PackageKit GTK3+ module allows any Pango application to install \
fonts from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gtk3-module-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "fca5c288c345e0688914c8684225ec99b88499c0de3a31ba383052284a48a81683b3a132673709ec3ff4e957ab00ca50be575aed5ba8704e87dfe2f4f2f014ce"

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
