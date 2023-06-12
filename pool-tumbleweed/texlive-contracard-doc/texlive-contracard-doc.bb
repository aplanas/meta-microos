SUMMARY = "Documentation for texlive-contracard"
DESCRIPTION = "This package includes the documentation for texlive-contracard"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0.0svn50217"

RPM_NAME = "texlive-contracard-doc-2023.204.2.0.0svn50217-54.1.noarch.rpm"
RPM_HASH = "efa7a43c20bb97965e832099990c2981829c91c8249f2a6ba9771b6dd81bde892e4b41cc6d6a9bf6618a6cc0780d401f1bb9d3c307c476de011386c3d5e1a4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-contracard-doc"
RDEPENDS:${PN} += ""

inherit rpm
