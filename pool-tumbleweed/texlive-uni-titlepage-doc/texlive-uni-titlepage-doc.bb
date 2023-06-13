SUMMARY = "Documentation for texlive-uni-titlepage"
DESCRIPTION = "This package includes the documentation for texlive-uni-titlepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn64306"

RPM_NAME = "texlive-uni-titlepage-doc-2023.201.1.1asvn64306-53.1.noarch.rpm"
RPM_HASH = "12108230a04765a84b013e120a1a6442bb9c0e7ea0ea5f4c5ab48fdb92ded0b6ab405363940de60eed511a6bbd420512b79e82aba57fc0055f714381d45f0a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uni-titlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
