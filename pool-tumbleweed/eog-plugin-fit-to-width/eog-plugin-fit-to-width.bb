SUMMARY = "Eog fit to width plugin"
DESCRIPTION = "The Eye of Gnome fit to width plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-fit-to-width-44.0-1.1.aarch64.rpm"
RPM_HASH = "9150c5421667e8327f15bd1b649f3872f1194e042bcea19c6f347b3141e4bbf511f043e0160554423b9e4cc80168f3418b179147a453708446f28ea87bfd0a2e"

RPROVIDES:${PN} += "eog-plugin-fit-to-width \
eog-plugin-fit-to-width(aarch-64) \
eog-plugins:/usr/lib64/eog/plugins/fit-to-width.plugin \
libfit-to-width.so()(64bit) \
metainfo() \
metainfo(eog-fit-to-width.appdata.xml)"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libeog.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit)"

inherit rpm
