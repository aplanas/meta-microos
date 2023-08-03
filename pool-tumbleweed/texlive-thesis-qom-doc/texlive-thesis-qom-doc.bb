SUMMARY = "Documentation for texlive-thesis-qom"
DESCRIPTION = "This package includes the documentation for texlive-thesis-qom"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-doc-2023.209.0.0.5svn63524-55.1.noarch.rpm"
RPM_HASH = "0641e0b243667d3d1c18859f8c4c2c9e6e44c9af879069a0d0edea0e5d9f32b3a97da1d84ce38af5defdb0bb80c8511528b62f3f8cbaadb9851f57efb54de271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thesis-qom-doc-fa-ir \
texlive-thesis-qom-doc"

RDEPENDS:${PN} += ""

inherit rpm
