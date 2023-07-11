SUMMARY = "Documentation for texlive-guitartabs"
DESCRIPTION = "This package includes the documentation for texlive-guitartabs"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48102"

RPM_NAME = "texlive-guitartabs-doc-2023.201.svn48102-53.2.noarch.rpm"
RPM_HASH = "8c148666ba686d419d5ba0f7582f9fb1779be872ddc9b560b91cb77e959219a883721c39429efd43403e86a6b36ab71a4b50b025a494b1d1ef79252df54d59df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitartabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
