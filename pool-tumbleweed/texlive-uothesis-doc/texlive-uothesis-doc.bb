SUMMARY = "Documentation for texlive-uothesis"
DESCRIPTION = "This package includes the documentation for texlive-uothesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-doc-2023.209.2.5.6svn25355-54.1.noarch.rpm"
RPM_HASH = "0b8406f4fed7da39ea4dca1bea075fc1d69ad7157a0e59029b23ed599b9a5828dfefb163c44b3ee68605b7dd2bea1835cd4b2aca1313eb02a86abeb38ef2d1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uothesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
