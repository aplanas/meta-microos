SUMMARY = "A lightweight text editor written in Lua"
DESCRIPTION = "Lite XL is derived from lite. \
It is a lightweight text editor written mostly in Lua. \
It aims to provide something practical, pretty, small and fast easy to modify \
and extend, or to use without doing either. The aim of Lite XL compared to \
lite is to be more user friendly, improve the quality of font rendering, and \
reduce CPU usage."
LICENSE = "MIT"

PV = "2.1.1+git20230805.3979730"

RPM_NAME = "lite-xl-2.1.1+git20230805.3979730-1.1.aarch64.rpm"
RPM_HASH = "5b2507db75c14c3ec398dc047721e9675d8d1cca5465cf26e24f25f0c006cc6fc6ba72b8bc2df39240ac03707f186da9eaa58e1c3f5d21db8d4e8419595c3eed"

RPROVIDES:${PN} += "lite-xl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfreetype.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libpcre2-8.so.0 \
lite-xl-plugin-manager"

inherit rpm
