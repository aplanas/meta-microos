SUMMARY = "Documentation for texlive-smartref"
DESCRIPTION = "This package includes the documentation for texlive-smartref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn20311"

RPM_NAME = "texlive-smartref-doc-2023.209.1.9svn20311-58.1.noarch.rpm"
RPM_HASH = "7145e1b0deed05265a6aa012f487def211a5594308052868c9a7a1f99948a4272d6b2862a8d2a35fddde61fbae86f67b2bae216a8caa63f164440299a052f002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartref-doc"

RDEPENDS:${PN} += ""

inherit rpm
