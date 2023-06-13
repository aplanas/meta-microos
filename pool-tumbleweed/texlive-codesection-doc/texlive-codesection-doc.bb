SUMMARY = "Documentation for texlive-codesection"
DESCRIPTION = "This package includes the documentation for texlive-codesection"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn34481"

RPM_NAME = "texlive-codesection-doc-2023.201.0.0.1svn34481-53.1.noarch.rpm"
RPM_HASH = "46955a2fb4daa5e2a9b5101845b4c0b79f3693a56d32adab91639318304bdb9605d5e7c80477d8cb8d923f83b54616298c35b857701b496354c67f1e1c195b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codesection-doc"

RDEPENDS:${PN} += ""

inherit rpm
