SUMMARY = "Documentation for texlive-plainpkg"
DESCRIPTION = "This package includes the documentation for texlive-plainpkg"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-doc-2023.201.0.0.4asvn27765-51.1.noarch.rpm"
RPM_HASH = "1730f5b901a623d95fefeb43e21fc21d96b12257f0edf496816b40125e080237ad56b7975a35a8f6fbe02d1319d8c4218f25547aff874679a6a0319027c15d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plainpkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
