SUMMARY = "Documentation for texlive-gitstatus"
DESCRIPTION = "This package includes the documentation for texlive-gitstatus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64662"

RPM_NAME = "texlive-gitstatus-doc-2023.201.1.1svn64662-53.2.noarch.rpm"
RPM_HASH = "7622dc33d508a3f184815c134f3b98a8d00e28f4daca53991fabfe96cc115ba4cfbe5c428df971525d6d93bd64b42385c749b989ac39a137e59d6d9b83f31d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitstatus-doc"

RDEPENDS:${PN} += ""

inherit rpm
