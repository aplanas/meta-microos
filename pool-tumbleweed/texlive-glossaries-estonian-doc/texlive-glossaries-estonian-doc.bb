SUMMARY = "Documentation for texlive-glossaries-estonian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-estonian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49928"

RPM_NAME = "texlive-glossaries-estonian-doc-2023.201.1.0svn49928-53.2.noarch.rpm"
RPM_HASH = "c8ea4579c6ff3d6414e4be4acc444b3fc7b61afd32290f85d8b7ced778024469cfac8fed68604a9ab358cebe4de9a1b54ad2645b7bd562e94883a5205c0d2326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-estonian-doc"

RDEPENDS:${PN} += ""

inherit rpm
