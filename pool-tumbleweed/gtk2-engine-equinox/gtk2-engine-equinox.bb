SUMMARY = "Equinox GTK+ Theme Engine"
DESCRIPTION = "Equinox is a theme engine for GTK+. It is a heavily modified derivative \
of the Aurora engine (version 1.40)."
LICENSE = "GPL-2.0+"

PV = "1.50"

RPM_NAME = "gtk2-engine-equinox-1.50-10.28.aarch64.rpm"
RPM_HASH = "37b95e35aa38667197710ce9c0ab39eee52b47b174f32cd82813498d9474b9710ee0315059843a04c29a0c3da6d91d90969433d282a5f0093816d663a2dfbc5f"

RPROVIDES:${PN} += "gtk2-engine-equinox \
gtk2-engine-equinox(aarch-64) \
libequinox.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
