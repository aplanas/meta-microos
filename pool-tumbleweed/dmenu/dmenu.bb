SUMMARY = "A generic and efficient menu for X"
DESCRIPTION = "dmenu is a dynamic menu for X, originally designed for dwm. It manages \
large numbers of user-defined menu items efficiently."
LICENSE = "MIT"

PV = "5.2"

RPM_NAME = "dmenu-5.2-1.2.aarch64.rpm"
RPM_HASH = "e50b9a90049f9ad988264b0a5bc52bee5c0df0f99eaf2cff0d8fdc2b91453325ad594ed8bcc207358c46ebf8da7e7b41a8d3861622dcbc7edb14cf6348f766e0"

RPROVIDES:${PN} += "dmenu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libc.so.6 \
libfontconfig.so.1"

inherit rpm
