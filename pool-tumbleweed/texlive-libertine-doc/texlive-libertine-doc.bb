SUMMARY = "Documentation for texlive-libertine"
DESCRIPTION = "This package includes the documentation for texlive-libertine"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.5.3.0svn64359"

RPM_NAME = "texlive-libertine-doc-2023.201.5.3.0svn64359-54.1.noarch.rpm"
RPM_HASH = "953bf3d393ab1f6ca5c12d27c5f9bf24fcde93829168160da0eb0b445d05c10a67e342862ebe086d0b362d2daa8a44a9322e739f716ab8f3667a2aec0730a3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertine-doc"
RDEPENDS:${PN} += ""

inherit rpm
