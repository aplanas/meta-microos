SUMMARY = "Documentation for texlive-metaplot"
DESCRIPTION = "This package includes the documentation for texlive-metaplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-metaplot-doc-2023.209.0.0.91svn15878-55.1.noarch.rpm"
RPM_HASH = "8eb51a418dcae811c12f8f5ee42df32fb33e953cf7b8451c25cdaec3b3c26ff47629d5211668a423697b60fc372bb978f05b6bd9d5fe94017a055d07babd9467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
