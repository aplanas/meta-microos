SUMMARY = "Documentation for texlive-metaplot"
DESCRIPTION = "This package includes the documentation for texlive-metaplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-metaplot-doc-2023.201.0.0.91svn15878-54.1.noarch.rpm"
RPM_HASH = "aca08eb853cf5249a80f73feb3f5e698be3bf6e9ac015ec7e03aa394082e1d1a0db1ecf3d54d2ea1acf51f8e2e6f4cd95bbdbe9e70f2a985c8d367123310f4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
