SUMMARY = "Utility to print contents of X events"
DESCRIPTION = "xev creates a window and then asks the X server to send it X11 events \
whenever anything happens to the window (such as it being moved, \
resized, typed in, clicked in, etc.). You can also attach it to an \
existing window. It is useful for seeing what causes events to occur \
and to display the information that they contain; it is essentially a \
debugging and development tool, and should not be needed in normal \
usage."
LICENSE = "X11"

PV = "1.2.5"

RPM_NAME = "xev-1.2.5-2.3.aarch64.rpm"
RPM_HASH = "833babab692ffd666d71d69329534faf12476e024ee01d3f0b1a4557f434f627e0c3e87eeb066909e9c64f3c5076669940131aaa32657666ad3c9702c26a6bbe"

RPROVIDES:${PN} += "xev \
xev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
