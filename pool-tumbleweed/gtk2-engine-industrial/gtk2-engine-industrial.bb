SUMMARY = "Industrial GTK+ 2 Theme Engine"
DESCRIPTION = "The Industrial engine provides a simple and consistent appearance for \
applications."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-industrial-2.20.2-19.42.aarch64.rpm"
RPM_HASH = "8e5e797dbbdd152ddff64c6da1a668c06ce4ad11d0df2e40254f7a568b22482c65ba94a761e4abb70f80e7bffbf169a90a097b5a2bcb11edd2cd4dfeb52c5c60"

RPROVIDES:${PN} += "gtk2-engine-industrial \
gtk2-engine-industrial(aarch-64) \
libindustrial.so()(64bit)"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
