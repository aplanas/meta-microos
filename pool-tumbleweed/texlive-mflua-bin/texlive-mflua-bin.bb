SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "d1f44b48e4b2817602baa7990425ef90d9584353f955ea5dc3f15d3d13993168c8c966ecd00c9cb1edcfe1a835abf884c8a0bece834a6ae324fdf3ca7544043d"

RPROVIDES:${PN} += "texlive-mflua-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libtexlua53.so.5 \
libtexluajit.so.2 \
texlive-mflua"

inherit rpm
