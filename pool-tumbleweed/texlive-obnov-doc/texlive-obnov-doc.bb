SUMMARY = "Documentation for texlive-obnov"
DESCRIPTION = "This package includes the documentation for texlive-obnov"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn33355"

RPM_NAME = "texlive-obnov-doc-2023.201.0.0.11svn33355-54.1.noarch.rpm"
RPM_HASH = "18d109efa7b2176a0ee44ae4b86c310e91bba7654c5b31d1cfec0ab9dc2ff0a0b74a3635982528507c253de787afdacd899ba10a0478a6d01880bcee00b68337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-obnov-doc"

RDEPENDS:${PN} += ""

inherit rpm
