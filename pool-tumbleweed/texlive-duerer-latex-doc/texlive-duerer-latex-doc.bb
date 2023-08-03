SUMMARY = "Documentation for texlive-duerer-latex"
DESCRIPTION = "This package includes the documentation for texlive-duerer-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-duerer-latex-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "db66ae700ef04c58af77d43c4ad915186faec3c1fb4d8d0d0a6051a56fe0dfb7a4616da1092da18fd9a2ef21f445afbd407b65bccf9675edb46e3516a2c030b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duerer-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
