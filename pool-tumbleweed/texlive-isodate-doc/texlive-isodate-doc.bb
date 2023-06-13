SUMMARY = "Documentation for texlive-isodate"
DESCRIPTION = "This package includes the documentation for texlive-isodate"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.28svn16613"

RPM_NAME = "texlive-isodate-doc-2023.201.2.28svn16613-55.1.noarch.rpm"
RPM_HASH = "434d1f02b3ac6000d625fef1b13962e263015d7be13e7369bd15675d993cbe15c01feb9170a89e82438532fcb7cb07d588124f3b311a3004fc19b2c50b8db0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isodate-doc"

RDEPENDS:${PN} += ""

inherit rpm
