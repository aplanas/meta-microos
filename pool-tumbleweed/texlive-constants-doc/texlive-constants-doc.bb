SUMMARY = "Documentation for texlive-constants"
DESCRIPTION = "This package includes the documentation for texlive-constants"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn15878"

RPM_NAME = "texlive-constants-doc-2023.204.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "7acc4593c297e4c12f6ca185d5e0148ac9ad96ec19b27dd179283d798ceeb0b22e37e6453d75cccd0cbddbc53ee6c06ac6357803057ba5e3ed7312cab98e66e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-constants-doc"

RDEPENDS:${PN} += ""

inherit rpm
