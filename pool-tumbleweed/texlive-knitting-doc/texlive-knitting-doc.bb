SUMMARY = "Documentation for texlive-knitting"
DESCRIPTION = "This package includes the documentation for texlive-knitting"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn50782"

RPM_NAME = "texlive-knitting-doc-2023.201.3.0svn50782-55.1.noarch.rpm"
RPM_HASH = "a7e30c83cde6b5f196c960b7c80465516c375fa1a3183f20d83f1b115b8d62b48e47faa3fc1deff9105082a4bc99fa015acedbdba7cee0e63b248cef8d34173c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knitting-doc"

RDEPENDS:${PN} += ""

inherit rpm
