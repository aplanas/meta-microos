SUMMARY = "Equinox GTK+ Theme Engine"
DESCRIPTION = "Equinox is a theme engine for GTK+. It is a heavily modified derivative \
of the Aurora engine (version 1.40)."
LICENSE = "GPL-2.0+"

PV = "1.50"

RPM_NAME = "gtk2-engine-equinox-1.50-10.29.aarch64.rpm"
RPM_HASH = "595a4a715981eaf56bf7ac2b9a56290acc2ad63284f6c33b081d999781b65c606b83542fba942dfa8bd68c7ada3bb521941530c7ff71c759dfc92c5d5713c701"

RPROVIDES:${PN} += "gtk2-engine-equinox \
libequinox.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
