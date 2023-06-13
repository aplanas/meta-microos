SUMMARY = "Install fonts automatically using PackageKit"
DESCRIPTION = "The PackageKit GTK3+ module allows any Pango application to install \
fonts from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-gtk3-module-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "fca5c288c345e0688914c8684225ec99b88499c0de3a31ba383052284a48a81683b3a132673709ec3ff4e957ab00ca50be575aed5ba8704e87dfe2f4f2f014ce"

RPROVIDES:${PN} += "PackageKit-gtk3-module \
PackageKit-gtk3-module(aarch-64) \
libpk-gtk-module.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfontconfig.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit)"

inherit rpm
