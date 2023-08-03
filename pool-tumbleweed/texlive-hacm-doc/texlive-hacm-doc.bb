SUMMARY = "Documentation for texlive-hacm"
DESCRIPTION = "This package includes the documentation for texlive-hacm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27671"

RPM_NAME = "texlive-hacm-doc-2023.209.0.0.1svn27671-54.1.noarch.rpm"
RPM_HASH = "7220877be62f71e0e9ec7d6aecccad97663a75d434d56ef0a6e40e1b520fba1e0c6c919064e31e319890b4e3b01174752c43a91a14baec411fafa2fb6afda150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hacm-doc"

RDEPENDS:${PN} += ""

inherit rpm
