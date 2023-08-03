SUMMARY = "Documentation for texlive-catchfile"
DESCRIPTION = "This package includes the documentation for texlive-catchfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn53084"

RPM_NAME = "texlive-catchfile-doc-2023.209.1.8svn53084-53.1.noarch.rpm"
RPM_HASH = "1b624ee4290f4c6ffe4a55a857054ed87b0a03eae09217c69db052f982f9126953dae1facbb362c3a2455b41a8c470dd1471d65e05cb6dd77aaca977fe4da70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
