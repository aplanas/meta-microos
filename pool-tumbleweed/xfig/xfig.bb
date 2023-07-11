SUMMARY = "Facility for Interactive Generation of Figures under the X Window System"
DESCRIPTION = "Xfig is a menu-driven tool that allows the user to draw and manipulate \
objects interactively in an X Window System window.  The resulting \
pictures can be saved, printed on PostScript printers, or converted to \
a variety of other formats (to allow inclusion in LaTeX documents, for \
example)."
LICENSE = "MIT"

PV = "3.2.8a"

RPM_NAME = "xfig-3.2.8a-3.9.aarch64.rpm"
RPM_HASH = "aad49cc92a35493ed6eb4622a9d15843ac164660982e246018a7876e34ab0a0e822d331a32a866181c9fb0d77ecfe5f0e1fdc916f615d6a930e6f03b8a3c9573"

RPROVIDES:${PN} += "xfig \
xfig.3.2.3d"

RDEPENDS:${PN} += "efont-unicode \
ghostscript-fonts-std \
ifnteuro \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
mkfontdir \
mkfontscale \
netpbm \
transfig \
xorg-x11-fonts \
xorg-x11-fonts-core"

inherit rpm
