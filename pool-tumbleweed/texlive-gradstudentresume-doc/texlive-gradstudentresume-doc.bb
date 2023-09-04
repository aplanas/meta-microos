SUMMARY = "Documentation for texlive-gradstudentresume"
DESCRIPTION = "This package includes the documentation for texlive-gradstudentresume"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38832"

RPM_NAME = "texlive-gradstudentresume-doc-2023.209.svn38832-54.2.noarch.rpm"
RPM_HASH = "0e0dde8e9ec416138ddaf4869e3e2dd53c47d76815176e3a0f71159c8350bcfd650e1dd775623352bdb81639d3faad59183c9fd602e6c9dd7c5831a0ed6861df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradstudentresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
