SUMMARY = "Documentation for texlive-gamebooklib"
DESCRIPTION = "This package includes the documentation for texlive-gamebooklib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn63424"

RPM_NAME = "texlive-gamebooklib-doc-2023.201.1.3svn63424-52.1.noarch.rpm"
RPM_HASH = "60915af33a7178e252d4a8ea428c1003ade5ae6b3ed6eced21a046e69f0287f89a94cf1a22fe781ca19a158d1930dc6f6fd0b243cbe92193338a8cbf663a2724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gamebooklib-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
