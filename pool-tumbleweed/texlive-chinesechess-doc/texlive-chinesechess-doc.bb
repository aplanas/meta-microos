SUMMARY = "Documentation for texlive-chinesechess"
DESCRIPTION = "This package includes the documentation for texlive-chinesechess"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn63276"

RPM_NAME = "texlive-chinesechess-doc-2023.201.1.2.0svn63276-53.1.noarch.rpm"
RPM_HASH = "a749ae61a661812b9dd14fdc9b3c26e38b2a9dc5c3a654aba5d0ba6f1fd05af54a6a746c4e2efef2a4a8256ae77072f8a9875c8a9a1653c7959a1f9fb5fc0fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chinesechess-doc-zh \
texlive-chinesechess-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
