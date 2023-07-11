SUMMARY = "Classic single screen vertical shoot em up"
DESCRIPTION = "XGalaga++ is a classic vertical scrolling shoot em up. \
It requires no X Window extension and its window is freely resizable. \
It is inspired by XGalaga, but rewritten from scratch, \
except for the graphics."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "xgalaga++-0.9-1.15.aarch64.rpm"
RPM_HASH = "518c039a36a1aadcbc4249a6226ef6a0b7297cd97c6d6d0e6b5a1a1160c2b7ee07d501c2dc4f36117ebf5e3c7b4b0a4430e6270b044ebff06dedb4f81df89daa"

RPROVIDES:${PN} += "xgalaga++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
