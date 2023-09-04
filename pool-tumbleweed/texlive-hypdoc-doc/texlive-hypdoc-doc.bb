SUMMARY = "Documentation for texlive-hypdoc"
DESCRIPTION = "This package includes the documentation for texlive-hypdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.18svn65678"

RPM_NAME = "texlive-hypdoc-doc-2023.209.1.18svn65678-54.1.noarch.rpm"
RPM_HASH = "51868e5bda4c66e0eff95105846808f6bd50c5526cd20b07bfcecd9bc1fc32918d3f93dbd2094b2cda196c20912d39d0d88f12bd85a882158fb889c4585658f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
