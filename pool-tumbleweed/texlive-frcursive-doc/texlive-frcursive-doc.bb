SUMMARY = "Documentation for texlive-frcursive"
DESCRIPTION = "This package includes the documentation for texlive-frcursive"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24559"

RPM_NAME = "texlive-frcursive-doc-2023.209.svn24559-53.1.noarch.rpm"
RPM_HASH = "dfc59dd6051e7e5793d4a6fe1878b107339c37091eef995c76c402d2e95c2bc4ce8937adaaa5552b583ae86f71acf5be26db76ecb0969e2a9c227556664d9844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frcursive-doc"

RDEPENDS:${PN} += ""

inherit rpm
