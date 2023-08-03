SUMMARY = "Documentation for texlive-wheelchart"
DESCRIPTION = "This package includes the documentation for texlive-wheelchart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64373"

RPM_NAME = "texlive-wheelchart-doc-2023.209.1.0svn64373-54.1.noarch.rpm"
RPM_HASH = "4b9f1e4bf4c8c9198adda5573a4d867185be3b57d872d39fd8b89a8a783d25d7ffac43a9120ba0c3bb5cd1d644b14a93bde5141d5c2457daaf6a25182936fe6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wheelchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
