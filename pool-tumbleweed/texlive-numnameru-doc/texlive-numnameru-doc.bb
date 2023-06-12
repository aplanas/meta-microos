SUMMARY = "Documentation for texlive-numnameru"
DESCRIPTION = "This package includes the documentation for texlive-numnameru"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44895"

RPM_NAME = "texlive-numnameru-doc-2023.201.svn44895-54.1.noarch.rpm"
RPM_HASH = "669c828017ed6a0c7060b4f11b91e76b0e367e951e0fafd0c77f868b04ba05319292046000ed17436b4284e4f380617393ca34b441771b12980fe2d2d2757c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numnameru-doc"
RDEPENDS:${PN} += ""

inherit rpm
