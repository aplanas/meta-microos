SUMMARY = "Documentation for texlive-elocalloc"
DESCRIPTION = "This package includes the documentation for texlive-elocalloc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-doc-2023.201.0.0.03svn42712-53.1.noarch.rpm"
RPM_HASH = "2982ed317772b92583e0d2556d388922fc27aeb0f6e58ca447e6f9a007c045be90343c7d17d54e1e7efa7946593a8e51c1ab832033950f083058afa2ee9b5c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elocalloc-doc"
RDEPENDS:${PN} += ""

inherit rpm
