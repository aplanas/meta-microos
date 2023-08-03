SUMMARY = "Documentation for texlive-syntaxdi"
DESCRIPTION = "This package includes the documentation for texlive-syntaxdi"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-doc-2023.209.0.0.8.2svn56685-58.1.noarch.rpm"
RPM_HASH = "1e8264c0ad4be236a192212e0f14ed52831418aa88649ca66c0004643ab4730a3a977810e057c65af9cbf4881cba7e0b7bf10e9e6d8ed607a9c4b2e05ec357f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syntaxdi-doc"

RDEPENDS:${PN} += ""

inherit rpm
