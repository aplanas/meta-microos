SUMMARY = "Documentation for texlive-rlepsf"
DESCRIPTION = "This package includes the documentation for texlive-rlepsf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19082"

RPM_NAME = "texlive-rlepsf-doc-2023.201.svn19082-53.1.noarch.rpm"
RPM_HASH = "c3271195a1c1868460c41794158fcf66643cdc1532ebc57c7d1cc6e8aadc59faba0e4673141f59f8c8db65ec78d86abe97e5d5833c24f481b9ff9047d92517b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rlepsf-doc"
RDEPENDS:${PN} += ""

inherit rpm
