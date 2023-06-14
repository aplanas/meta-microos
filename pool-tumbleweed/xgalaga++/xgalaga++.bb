SUMMARY = "Classic single screen vertical shoot em up"
DESCRIPTION = "XGalaga++ is a classic vertical scrolling shoot em up. \
It requires no X Window extension and its window is freely resizable. \
It is inspired by XGalaga, but rewritten from scratch, \
except for the graphics."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "xgalaga++-0.9-1.14.aarch64.rpm"
RPM_HASH = "a8302d020ce6361cf5032c4ca119ca3313feb14297800139b849cc51cb078e4080a1524b6c453dd7fcd5ab216b680169f438025902cde06f5f2d520c42c5d220"

RPROVIDES:${PN} += "xgalaga++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
