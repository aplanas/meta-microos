SUMMARY = "Documentation for texlive-babel-indonesian"
DESCRIPTION = "This package includes the documentation for texlive-babel-indonesian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn43235"

RPM_NAME = "texlive-babel-indonesian-doc-2023.201.1.0msvn43235-53.1.noarch.rpm"
RPM_HASH = "8cf6ae390b0fa13163079b9ddc3cb5b9fa551b018deef05d1eff4115fc310d9acabbcc9bca98ddd0d7b55017204bb42b5fbe63f972b7d6902fe8a8701c4fba5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-indonesian-doc"
RDEPENDS:${PN} += ""

inherit rpm
