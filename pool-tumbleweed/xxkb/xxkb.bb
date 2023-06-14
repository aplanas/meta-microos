SUMMARY = "A keyboard layout indicator and switcher"
DESCRIPTION = "The xxkb program is a keyboard layout switcher and indicator. Unlike the \
programs that reload keyboard maps and use their own hot-keys, xxkb is a \
simple GUI for XKB (X KeyBoard extension) and just sends commands to and \
accepts events from XKB. That means that it will work with the existing \
setup of your X Server without any modifications."
LICENSE = "Artistic-2.0"

PV = "1.11.1"

RPM_NAME = "xxkb-1.11.1-2.12.aarch64.rpm"
RPM_HASH = "6bba8df89b953889b56bd8c1ac5f674ca9932891c307ca7e87951810e4c31a6fb5978b59de95021308d9f8d6d0ca6e5d0fd8958e976b684598db0ba23424f7e0"

RPROVIDES:${PN} += "xxkb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
