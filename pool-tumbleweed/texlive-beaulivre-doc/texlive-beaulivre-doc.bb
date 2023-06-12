SUMMARY = "Documentation for texlive-beaulivre"
DESCRIPTION = "This package includes the documentation for texlive-beaulivre"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65475"

RPM_NAME = "texlive-beaulivre-doc-2023.201.svn65475-53.1.noarch.rpm"
RPM_HASH = "6c94e9e1f1d8b7d5f7b55d046dded652226e376e79b4b6afb1e9d427ef831973cbd8f3972db9b893d433303cd024b45b95bbbb67a897383b3f9f65fba8e63d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beaulivre-doc"
RDEPENDS:${PN} += ""

inherit rpm
