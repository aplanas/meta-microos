SUMMARY = "Utility to change the keyboard layout in X"
DESCRIPTION = "setxkbmap is an X11 client to change the keymaps in the X server for a \
specified keyboard to use the layout determined by the options listed \
on the command line."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "setxkbmap-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "6f9100d8a69f48074a3c6db7a69c9354c56752f3b3b002b1c7156d4fa18d38654ac5b3f17f2786425565541d866c3fb6cb88c90925c3c5367830fd7abffa12cb"

RPROVIDES:${PN} += "setxkbmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
