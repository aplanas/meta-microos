SUMMARY = "Documentation for texlive-dviinfox"
DESCRIPTION = "This package includes the documentation for texlive-dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn59216"

RPM_NAME = "texlive-dviinfox-doc-2023.209.1.06svn59216-54.2.noarch.rpm"
RPM_HASH = "659eddaa877683dfe8c50946afabb1c6d8ca1015f98afdc4d752423f48ed1964b01416095bd0dde46b1f91d214b0a412e4a3d1ab1fa2586b73adadbb1e0af1cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviinfox-doc"

RDEPENDS:${PN} += ""

inherit rpm
