SUMMARY = "A general purpose messaging and notification program"
DESCRIPTION = "Dezen is a general purpose messaging, notification and menuing program for X11. It was designed to be scriptable in any language and integrate well with window managers like dwm, wmii and xmonad though it will work with any windowmanger."
LICENSE = "MIT"

PV = "1379930259.488ab66"

RPM_NAME = "dzen2-1379930259.488ab66-1.18.aarch64.rpm"
RPM_HASH = "a867f81d436db9ca3636aaa14bb1d118caa350b0629bbbc9ba3b8b4bb8909e25621e20cf7ee5df2555b47bc6122e9ffed3eb5b53e5eb63095d947ee09147ccff"

RPROVIDES:${PN} += "dzen2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6"

inherit rpm
