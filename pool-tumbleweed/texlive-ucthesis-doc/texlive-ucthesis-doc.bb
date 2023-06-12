SUMMARY = "Documentation for texlive-ucthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn15878"

RPM_NAME = "texlive-ucthesis-doc-2023.201.3.2svn15878-53.1.noarch.rpm"
RPM_HASH = "af3fa11f89aed399904d1daceb3143027a80f0c8f63f48fb5241200da0ec7fb8ca985a19a28e94ef3ec7fb67b73856d75095ca456e90d9b421ab06dc2637258a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
