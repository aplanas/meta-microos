SUMMARY = "Documentation for texlive-punk"
DESCRIPTION = "This package includes the documentation for texlive-punk"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn27388"

RPM_NAME = "texlive-punk-doc-2023.201.svn27388-53.2.noarch.rpm"
RPM_HASH = "d24f0ebf577a42a12493f24821dc77cc77e5cb86bb7e8527560fc6eb1ab81f0f73f94856f50d0e3e07fe59e778a38cbc85a33f45479ff3f0cb22d6a83304db8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-doc"

RDEPENDS:${PN} += ""

inherit rpm
