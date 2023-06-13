SUMMARY = "Utility to display all the characters in an X font"
DESCRIPTION = "The xfd utility creates a window containing the name of the font being \
displayed, a row of command buttons, several lines of text for displaying \
character metrics, and a grid containing one glyph per cell."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xfd-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "14bf9f15baaf7a796206497b04effd23e11f8c3309e7f165f1b56f4088c9cafd28bbca1639656fd1ced997986f9b914bf232566059e00be3be947a2f834e1c8e"

RPROVIDES:${PN} += "xfd \
xfd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXft.so.2()(64bit) \
libXmu.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
