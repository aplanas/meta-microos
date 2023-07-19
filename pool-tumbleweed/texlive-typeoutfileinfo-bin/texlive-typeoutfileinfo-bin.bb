SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2023.20230311.svn25648-93.1.aarch64.rpm"
RPM_HASH = "fd190cc96904df5df0b54bcef3e3ab8e5139cfa3e9fea76f60655af277dd5f3f9f659ba69b585cf17d103ef7638562830611cf4f08d3a7cbc90224752dd615b6"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin"

RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
