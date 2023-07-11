SUMMARY = "Utility to display all the characters in an X font"
DESCRIPTION = "The xfd utility creates a window containing the name of the font being \
displayed, a row of command buttons, several lines of text for displaying \
character metrics, and a grid containing one glyph per cell."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xfd-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "d786b9bd57e3097c28b1aa4c4119efc69876298a0cc702bbe8830312a9f97c1666799089a605bee33345c9486ec46591dd565ade2984fe9db6fc18a25869afb3"

RPROVIDES:${PN} += "xfd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libxkbfile.so.1"

inherit rpm
