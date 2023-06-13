SUMMARY = "Documentation for texlive-punk-latex"
DESCRIPTION = "This package includes the documentation for texlive-punk-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn27389"

RPM_NAME = "texlive-punk-latex-doc-2023.201.1.1svn27389-53.1.noarch.rpm"
RPM_HASH = "c6f6e2393ade69c1f4890dd8203af0e7b479302510538a18275f6b398bbe4e0c48299028229314f16e55be46f98a3f180269360b7a3cec300092c4446089f3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
