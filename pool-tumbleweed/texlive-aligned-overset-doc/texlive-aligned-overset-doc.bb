SUMMARY = "Documentation for texlive-aligned-overset"
DESCRIPTION = "This package includes the documentation for texlive-aligned-overset"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn47290"

RPM_NAME = "texlive-aligned-overset-doc-2023.209.0.0.1.0svn47290-55.1.noarch.rpm"
RPM_HASH = "a31b81857c74b02c8bd46dee3d0dd3214f8030c0b82fb8b31b999db1fa33bcf1d9e3ec401a8af85f28caff358023509ce7228af448697a8370af35ef53552792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aligned-overset-doc"

RDEPENDS:${PN} += ""

inherit rpm
