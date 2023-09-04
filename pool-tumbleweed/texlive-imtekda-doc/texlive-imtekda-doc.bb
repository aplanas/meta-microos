SUMMARY = "Documentation for texlive-imtekda"
DESCRIPTION = "This package includes the documentation for texlive-imtekda"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn17667"

RPM_NAME = "texlive-imtekda-doc-2023.209.1.7svn17667-54.1.noarch.rpm"
RPM_HASH = "66dbf2a3f5dd2f64ecbbe7dcc0ec326d677cd3aa2fe39d1c6927fc4bd1ba00693ffff035c5711558fcea06809f5590ad06423e33c1db9a19d1a2a3dab7d3d2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-imtekda-doc-de \
texlive-imtekda-doc"

RDEPENDS:${PN} += ""

inherit rpm
