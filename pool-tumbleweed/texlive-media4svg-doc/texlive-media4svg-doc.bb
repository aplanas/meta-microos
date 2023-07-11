SUMMARY = "Documentation for texlive-media4svg"
DESCRIPTION = "This package includes the documentation for texlive-media4svg"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.13svn64686"

RPM_NAME = "texlive-media4svg-doc-2023.208.0.0.13svn64686-53.1.noarch.rpm"
RPM_HASH = "a52833ab87605c780725160f0d9ea881acc7c697f058ffea5409fa87f24f3dbd7629283604217bd20eb3feeca8957bd33982e0fb832d24d7d24661524a79c2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media4svg-doc"

RDEPENDS:${PN} += ""

inherit rpm
