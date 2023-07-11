SUMMARY = "Documentation for texlive-xtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xtuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-doc-2023.201.1.0svn47049-52.2.noarch.rpm"
RPM_HASH = "8f74a160640ca188ad023552bc84c1ccde3c5336d4d9f1f40ab6486b37136ad71929a00cdc80569353facc171028bf908f95c2d4cb650ab317a6612bb292fb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xtuthesis-doc-zh \
texlive-xtuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
