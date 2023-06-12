SUMMARY = "Documentation for texlive-chickenize"
DESCRIPTION = "This package includes the documentation for texlive-chickenize"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-doc-2023.201.0.0.3svn57325-53.1.noarch.rpm"
RPM_HASH = "6f40eeaf24c58fae9f4c91067e1061194f69bc9a902634398066a328d7607f1e3d98dd77f309778072bddba184590eae2b358e6b431214d960e495b2ec0b20ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chickenize-doc"
RDEPENDS:${PN} += ""

inherit rpm
