SUMMARY = "Documentation for texlive-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-latex-make"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4.3svn60874"

RPM_NAME = "texlive-latex-make-doc-2023.201.2.4.3svn60874-55.1.noarch.rpm"
RPM_HASH = "84883cb6ec6d29a1902b9d2ff17e819cf8e9294356d63f637c26571f879c0f2a39acf83d7b2313c23a716d3ff0e3676847c4413676bd656c5c15431451980a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
