SUMMARY = "Documentation for texlive-xcharter-math"
DESCRIPTION = "This package includes the documentation for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-doc-2023.201.0.0.36svn65686-52.2.noarch.rpm"
RPM_HASH = "bddda9f3d3b0f4aa754ad9b6949559b76d34eb762b851575fdc2d22db3e3920ec42e7f3ac906f2b993dd3d1d0615de67da34fee51ac94ebf52facfe660015b5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
