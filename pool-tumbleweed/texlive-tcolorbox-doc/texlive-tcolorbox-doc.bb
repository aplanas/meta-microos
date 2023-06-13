SUMMARY = "Documentation for texlive-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0.1svn65800"

RPM_NAME = "texlive-tcolorbox-doc-2023.201.6.0.1svn65800-54.1.noarch.rpm"
RPM_HASH = "c4a87c86c0837475374a8555eaa0f4e229ef2981fefd3d0b34902ab533b767606d0690e2f1b6d124c4dd8ca36ae5c4175de1e0b590fe9359794241da37113403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
