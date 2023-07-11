SUMMARY = "Documentation for texlive-mathdesign"
DESCRIPTION = "This package includes the documentation for texlive-mathdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.31svn31639"

RPM_NAME = "texlive-mathdesign-doc-2023.208.2.31svn31639-53.1.noarch.rpm"
RPM_HASH = "f1d586050c78cf067b55978b8f65acf8cabdd89042fccde5a873f3ea3803528028a6ce8f8cf2bea43b6421c058609d396e043f541dc07d9211ac9529d856f708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdesign-doc"

RDEPENDS:${PN} += ""

inherit rpm
