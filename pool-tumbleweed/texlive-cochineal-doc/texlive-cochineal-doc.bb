SUMMARY = "Documentation for texlive-cochineal"
DESCRIPTION = "This package includes the documentation for texlive-cochineal"
LICENSE = "OFL-1.1"

PV = "2023.201.1.077svn62063"

RPM_NAME = "texlive-cochineal-doc-2023.201.1.077svn62063-53.1.noarch.rpm"
RPM_HASH = "27738d98444b0704685a05f9996f590e6566cccc6fb9f002372cb7432ac16e90eda85b044a477d338f1993282d53d0faa03362fca48c5cd3c1e33b6df9f42e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cochineal-doc"

RDEPENDS:${PN} += ""

inherit rpm
