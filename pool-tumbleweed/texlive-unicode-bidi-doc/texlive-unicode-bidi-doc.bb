SUMMARY = "Documentation for texlive-unicode-bidi"
DESCRIPTION = "This package includes the documentation for texlive-unicode-bidi"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn42482"

RPM_NAME = "texlive-unicode-bidi-doc-2023.209.0.0.01svn42482-54.1.noarch.rpm"
RPM_HASH = "eb7bd7792bd48caaf128bbeaed07cade15767a53cfc414a8574b659e1a11260d83885a26433c890d81bca2188709c61574d5bdac76aeb50088ae19852320abd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-bidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
