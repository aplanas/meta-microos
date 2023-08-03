SUMMARY = "Documentation for texlive-biblatex-subseries"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-subseries"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn43330"

RPM_NAME = "texlive-biblatex-subseries-doc-2023.209.1.2.0svn43330-54.1.noarch.rpm"
RPM_HASH = "6cc9db41444c8bf9930dba9d926122f43ad9ca93fed9132021da40bb7b7cb331f4c9314ce3089a8c18bfb48dca129926a737521c3d4d61a54898d060188aed9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-subseries-doc"

RDEPENDS:${PN} += ""

inherit rpm
