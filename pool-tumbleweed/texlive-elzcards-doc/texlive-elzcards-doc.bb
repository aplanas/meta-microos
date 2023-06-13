SUMMARY = "Documentation for texlive-elzcards"
DESCRIPTION = "This package includes the documentation for texlive-elzcards"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.60svn51894"

RPM_NAME = "texlive-elzcards-doc-2023.201.1.60svn51894-53.1.noarch.rpm"
RPM_HASH = "a44e082d09ea198aa34cc3cb0d32b9e5d2c80449b7e6e1bea0d1049e180375d93b36c214e365da92e23e3bc241428d1188954e7fe1e02d899352ecd178245483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elzcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
