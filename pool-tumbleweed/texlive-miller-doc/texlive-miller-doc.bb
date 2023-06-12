SUMMARY = "Documentation for texlive-miller"
DESCRIPTION = "This package includes the documentation for texlive-miller"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18789"

RPM_NAME = "texlive-miller-doc-2023.201.1.2svn18789-54.1.noarch.rpm"
RPM_HASH = "0eecb96f32d639d00d5175ca247aab8547bf494e4c31ef214428b20d6aa0acef0466a24cf4422993e2d7c83ca9a819ecf18d22818e5a1a31a792c8d4383b4790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miller-doc"
RDEPENDS:${PN} += ""

inherit rpm
