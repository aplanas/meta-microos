SUMMARY = "Documentation for texlive-grading-scheme"
DESCRIPTION = "This package includes the documentation for texlive-grading-scheme"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-doc-2023.201.0.0.1.1svn62505-53.2.noarch.rpm"
RPM_HASH = "961d1a51d3c8b9c5cbf6f159680dfc593d843195a8bb31d568ea1cdb3f8139126daec16415a9b124c6c520946d63c453fc0d7ca2006c756bfe46fd3695655cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grading-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
