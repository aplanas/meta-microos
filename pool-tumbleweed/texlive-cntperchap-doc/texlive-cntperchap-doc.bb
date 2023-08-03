SUMMARY = "Documentation for texlive-cntperchap"
DESCRIPTION = "This package includes the documentation for texlive-cntperchap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-doc-2023.209.0.0.3svn37572-54.1.noarch.rpm"
RPM_HASH = "a2be2a137cb5a9859475b629bfa27b20c86c09a9c95d03d279a40dc2e746f20fbf59ef295b6ff0c1d31c7159c74bfae9733a4677014286fff0979d0f38d14aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntperchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
