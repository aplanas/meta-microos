SUMMARY = "Documentation for texlive-uowthesis"
DESCRIPTION = "This package includes the documentation for texlive-uowthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-doc-2023.201.1.0asvn19700-53.1.noarch.rpm"
RPM_HASH = "4cc8fd7fd4da784c7aaf206d18ab4b3f755d0819987244b40cbe3784c3c42787f8d5470637417dcc6d176fc88ebc68540824d4ea6fc5857dc5e94de4ac66bdef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
