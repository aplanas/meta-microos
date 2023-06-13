SUMMARY = "Binary files of tikztosvg"
DESCRIPTION = "Binary files of tikztosvg"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn55132"

RPM_NAME = "texlive-tikztosvg-bin-2023.20230311.svn55132-91.1.aarch64.rpm"
RPM_HASH = "8cf8a80b9f6bb5a37f6e3d0bbf654638db00ed1470fca590133c1e46b29366455fb11378d2100ecf4a2579103db133f7361d3d8e4ef26cc9f57fac7a3ffc32a9"

RPROVIDES:${PN} += "texlive-tikztosvg-bin \
texlive-tikztosvg-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-tikztosvg"

inherit rpm
