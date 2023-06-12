SUMMARY = "Documentation for texlive-lcd"
DESCRIPTION = "This package includes the documentation for texlive-lcd"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn16549"

RPM_NAME = "texlive-lcd-doc-2023.201.0.0.3svn16549-54.1.noarch.rpm"
RPM_HASH = "6b6263ee3235aa141a19460acd9e1ae5cecc81edb4677fb0b93173622eb0ca53722ebc7c384743a9da66eddc912aaf23300c8286d44098281f6f1746b4b648c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcd-doc"
RDEPENDS:${PN} += ""

inherit rpm
