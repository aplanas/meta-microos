SUMMARY = "Documentation for texlive-mathpazo"
DESCRIPTION = "This package includes the documentation for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.003svn52663"

RPM_NAME = "texlive-mathpazo-doc-2023.208.1.003svn52663-53.1.noarch.rpm"
RPM_HASH = "0a4ba3de4b075c15ed6dab226596b96d1ee90b83e88987f1e662038ef0a51f0f58ff5d7e52bfa2c09294112dc10d87f7a0843855027208d2afd1e4b435f25447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpazo-doc"

RDEPENDS:${PN} += ""

inherit rpm
