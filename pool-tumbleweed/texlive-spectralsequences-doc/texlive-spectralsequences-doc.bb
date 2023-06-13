SUMMARY = "Documentation for texlive-spectralsequences"
DESCRIPTION = "This package includes the documentation for texlive-spectralsequences"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-doc-2023.201.1.3.3svn65667-57.1.noarch.rpm"
RPM_HASH = "ccb5030b52280001eeb7904a265c0b6cf8304f463ed6a6715d131fe72f23f0576c5b8678833401275033a76cc429c891f4b60ecc9cca94fb3265bafb8aabe03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spectralsequences-doc"

RDEPENDS:${PN} += ""

inherit rpm
