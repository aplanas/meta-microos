SUMMARY = "Documentation for texlive-inline-images"
DESCRIPTION = "This package includes the documentation for texlive-inline-images"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.208.1.0svn61719"

RPM_NAME = "texlive-inline-images-doc-2023.208.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "9b14c2da0f5054e1cfc0caa5e2896ade6b04193203fc4c89a058dd6626afff42cfbc9f86039ec9652fe2587a75c233805fb5a19c21d427312a865ab9d52c5ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inline-images-doc"

RDEPENDS:${PN} += ""

inherit rpm
