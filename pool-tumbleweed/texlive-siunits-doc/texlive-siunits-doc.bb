SUMMARY = "Documentation for texlive-siunits"
DESCRIPTION = "This package includes the documentation for texlive-siunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.36svn59702"

RPM_NAME = "texlive-siunits-doc-2023.201.1.36svn59702-57.1.noarch.rpm"
RPM_HASH = "e02a19956c7601ab9d348da94df11c7a792609aa89d6e4a42b09e1c0649015a09bcbdcb542e97eeaad183e1c30b6b6d72c57ea919b94aecf59586f96ba06f54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunits-doc"
RDEPENDS:${PN} += ""

inherit rpm
