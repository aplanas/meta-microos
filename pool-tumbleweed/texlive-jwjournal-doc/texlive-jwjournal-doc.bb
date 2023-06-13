SUMMARY = "Documentation for texlive-jwjournal"
DESCRIPTION = "This package includes the documentation for texlive-jwjournal"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65480"

RPM_NAME = "texlive-jwjournal-doc-2023.201.svn65480-55.1.noarch.rpm"
RPM_HASH = "155c7b1425972eeaef92b36f8d7bf44c51d67b5a821379b6119c0db6c258a3dd86dcec05c4edead9be32ba6cef6a49cffce3437a0fe9d15f8c370a860c4c32e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jwjournal-doc"

RDEPENDS:${PN} += ""

inherit rpm
