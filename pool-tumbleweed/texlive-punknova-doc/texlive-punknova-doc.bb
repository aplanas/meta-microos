SUMMARY = "Documentation for texlive-punknova"
DESCRIPTION = "This package includes the documentation for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.003svn24649"

RPM_NAME = "texlive-punknova-doc-2023.201.1.003svn24649-53.2.noarch.rpm"
RPM_HASH = "fe8b6aeec18c2a5903a85b7ca99bc558f3f6c629c9420009160eb881685afa6458ad4a778739d5b61cad53c11efb72999976ca6cb51a077128d9087bc782cb27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
