SUMMARY = "Documentation for texlive-termlist"
DESCRIPTION = "This package includes the documentation for texlive-termlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn18923"

RPM_NAME = "texlive-termlist-doc-2023.201.1.1svn18923-54.1.noarch.rpm"
RPM_HASH = "178a969493f074ae8bc4d4f74946a1b5ebc413cf4fe9425b32e307d163927044df0ba5d59a7fa769a830dc914f6f8c4f530ecdc9ed34de09fd01fb320cb24926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
