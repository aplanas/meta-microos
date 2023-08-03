SUMMARY = "Documentation for texlive-turabian"
DESCRIPTION = "This package includes the documentation for texlive-turabian"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn36298"

RPM_NAME = "texlive-turabian-doc-2023.209.0.0.1.0svn36298-53.1.noarch.rpm"
RPM_HASH = "99ae79c633e68c8658f680a0b8ea41d4fb427d4a969ed3e5b5809f2605a1cbc13b7e82557700bfbc1051428ce04b743bf2ceeca19678f0578bd9c5d4d6ac5bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-doc"

RDEPENDS:${PN} += ""

inherit rpm
