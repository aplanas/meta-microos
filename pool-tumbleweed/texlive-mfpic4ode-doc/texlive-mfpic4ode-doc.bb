SUMMARY = "Documentation for texlive-mfpic4ode"
DESCRIPTION = "This package includes the documentation for texlive-mfpic4ode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn17745"

RPM_NAME = "texlive-mfpic4ode-doc-2023.201.0.0.4svn17745-54.1.noarch.rpm"
RPM_HASH = "3d2ce23f1a81e5377e8c89f2f58c033822c749a8cde32736508b9a85a30a6abc957646858f462f36442d73750c723daa9f683b634f1471b67a29bd08e4fab8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfpic4ode-doc"

RDEPENDS:${PN} += ""

inherit rpm
