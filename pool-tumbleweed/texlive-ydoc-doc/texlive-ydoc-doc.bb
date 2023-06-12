SUMMARY = "Documentation for texlive-ydoc"
DESCRIPTION = "This package includes the documentation for texlive-ydoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-doc-2023.201.0.0.7alphasvn64887-52.1.noarch.rpm"
RPM_HASH = "97b43cb1c8d7a6f44c0e77db36d4b7ca6b272ffcaa41c8072673b723041d3bd2abd5dce2c9dc1a8578b757f06f32142da359ff7d3988659082b59bae9db17721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ydoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
