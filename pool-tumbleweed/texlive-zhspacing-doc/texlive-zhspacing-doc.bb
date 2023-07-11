SUMMARY = "Documentation for texlive-zhspacing"
DESCRIPTION = "This package includes the documentation for texlive-zhspacing"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41145"

RPM_NAME = "texlive-zhspacing-doc-2023.201.svn41145-52.2.noarch.rpm"
RPM_HASH = "873e41c927cf011e55cb22b08d26334bff04917aeed00ef22d4497b198a8d9d8b5ccd0553af3891aa04edb9e3009af10fd779f11f281fd8dc5427e29db715477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhspacing-doc"

RDEPENDS:${PN} += ""

inherit rpm
