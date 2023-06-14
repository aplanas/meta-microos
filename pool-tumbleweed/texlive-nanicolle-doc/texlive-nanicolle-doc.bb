SUMMARY = "Documentation for texlive-nanicolle"
DESCRIPTION = "This package includes the documentation for texlive-nanicolle"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-doc-2023.201.2.03ysvn56224-54.1.noarch.rpm"
RPM_HASH = "3a3c796849a6262e6734093df4aa72ee636548af9aa2280da3906725297e70e4992c65cac8bb08920bb3d0c0759951ab0c1037f01af3827685dc2dddaaab9c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nanicolle-doc-zh \
texlive-nanicolle-doc"

RDEPENDS:${PN} += ""

inherit rpm
