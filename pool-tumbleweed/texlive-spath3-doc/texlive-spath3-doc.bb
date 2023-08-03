SUMMARY = "Documentation for texlive-spath3"
DESCRIPTION = "This package includes the documentation for texlive-spath3"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn64818"

RPM_NAME = "texlive-spath3-doc-2023.209.2.7svn64818-58.1.noarch.rpm"
RPM_HASH = "364be89aa1e2301b8a64af425243bf767c07c7390c7f7e61f67478520fe0786fa3fdfcaef6b334bb7169497a1993bffce71d82ea44bff1ed6e3aeae922dd096a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spath3-doc"

RDEPENDS:${PN} += ""

inherit rpm
