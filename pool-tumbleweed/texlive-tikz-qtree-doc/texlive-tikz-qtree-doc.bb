SUMMARY = "Documentation for texlive-tikz-qtree"
DESCRIPTION = "This package includes the documentation for texlive-tikz-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-doc-2023.201.1.2svn26108-52.1.noarch.rpm"
RPM_HASH = "b84ce4d62a249b31e53a9ddaa612e3b130a6ceb4230383e143abca61d4dc84eccfb97db1bbc9dc925cca669ef8170facaee7a73b5be31b538f403c33244813f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-qtree-doc"
RDEPENDS:${PN} += ""

inherit rpm
