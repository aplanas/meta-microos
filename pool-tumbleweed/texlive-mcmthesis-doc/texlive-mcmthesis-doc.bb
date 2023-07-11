SUMMARY = "Documentation for texlive-mcmthesis"
DESCRIPTION = "This package includes the documentation for texlive-mcmthesis"
LICENSE = "LPPL-1.0"

PV = "2023.208.6.3.1svn57333"

RPM_NAME = "texlive-mcmthesis-doc-2023.208.6.3.1svn57333-53.1.noarch.rpm"
RPM_HASH = "60638c082e4b3584e873ef1e476fcab1bba0cb070d29ed170aa28c98621b3e0920d4a8a29142c2239e6d3d3eee863cacc011f8aff24a073e77b96f29fc807b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-mcmthesis-doc-zh \
texlive-mcmthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
