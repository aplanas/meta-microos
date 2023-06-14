SUMMARY = "Documentation for texlive-repere"
DESCRIPTION = "This package includes the documentation for texlive-repere"
LICENSE = "LPPL-1.0"

PV = "2023.201.23.02svn65769"

RPM_NAME = "texlive-repere-doc-2023.201.23.02svn65769-53.1.noarch.rpm"
RPM_HASH = "c9df0bb04a5ea079c4ba113fc1b9d44283e94117cef7041a72936ae4c0d9b33dbf5c50b0804105b77cb9df740328d5934b8c424fbd9fdab6c5068780d911a426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-repere-doc-fr \
texlive-repere-doc"

RDEPENDS:${PN} += ""

inherit rpm
