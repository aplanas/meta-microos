SUMMARY = "Athena-based Minesweeper clone"
DESCRIPTION = "xbomb is a Minesweeper game using the X11 Athena widget set. It can \
be played with the traditional square tiling, and also offers \
hexagonal and triangle tiling."
LICENSE = "GPL-2.0-or-later"

PV = "2.2b"

RPM_NAME = "xbomb-2.2b-2.3.aarch64.rpm"
RPM_HASH = "644ce6e7a1f7bdd1cb2c1b6242a9cd3e90aaeec2c658b8b7333dd713f1716585440a76f604ab300a527dd53dc816da30339c908bf2518eafddb77d67169a3bf6"

RPROVIDES:${PN} += "xbomb \
xbomb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
