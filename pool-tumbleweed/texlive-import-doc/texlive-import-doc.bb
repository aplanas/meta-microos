SUMMARY = "Documentation for texlive-import"
DESCRIPTION = "This package includes the documentation for texlive-import"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.6.2svn54683"

RPM_NAME = "texlive-import-doc-2023.209.6.2svn54683-54.1.noarch.rpm"
RPM_HASH = "22b2d7c9f95131c6c442b8df4d23be123bca1e37f379945597c8445ebe80a1f7559acc74a1b91a275ea74d431f475381437d31ce8a36353a7831c2081473f1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-import-doc"

RDEPENDS:${PN} += ""

inherit rpm
