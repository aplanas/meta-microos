SUMMARY = "Documentation for texlive-babel-basque"
DESCRIPTION = "This package includes the documentation for texlive-babel-basque"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn30256"

RPM_NAME = "texlive-babel-basque-doc-2023.201.1.0fsvn30256-53.1.noarch.rpm"
RPM_HASH = "c4b662ce4447e4479254f3584e5c1d36e11ce075a052be56c81d24b52ef118b807d061c94f0ac63eb3ab0e11aa048401d08978ed2380e44149b1f49fc71d257f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-basque-doc"
RDEPENDS:${PN} += ""

inherit rpm
