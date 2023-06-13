SUMMARY = "A general purpose messaging and notification program"
DESCRIPTION = "Dezen is a general purpose messaging, notification and menuing program for X11. It was designed to be scriptable in any language and integrate well with window managers like dwm, wmii and xmonad though it will work with any windowmanger."
LICENSE = "MIT"

PV = "1379930259.488ab66"

RPM_NAME = "dzen2-1379930259.488ab66-1.17.aarch64.rpm"
RPM_HASH = "d416048346cbf4d665bcc63e13dd6c4c5a3e7a22c70f25ff3fd3dade93fa24189d32a370b1214a60a8cf7ba3885eb9cb31013849dce0a0763c5bcf7aac69d473"

RPROVIDES:${PN} += "dzen2 \
dzen2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXft.so.2()(64bit) \
libc.so.6()(64bit)"

inherit rpm
