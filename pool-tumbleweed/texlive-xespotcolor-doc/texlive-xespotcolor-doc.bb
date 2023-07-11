SUMMARY = "Documentation for texlive-xespotcolor"
DESCRIPTION = "This package includes the documentation for texlive-xespotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-doc-2023.201.2.1svn58212-52.2.noarch.rpm"
RPM_HASH = "4129f531fa2d7af028dc8c7f36c9856736fa1574be03c161f2fc0adee3935595ca2f540f0c3d2a7cdf168789dd905544023a25fe1bffffd78ac1ca2e8770e779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xespotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
