SUMMARY = "Documentation for texlive-recorder-fingering"
DESCRIPTION = "This package includes the documentation for texlive-recorder-fingering"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn66008"

RPM_NAME = "texlive-recorder-fingering-doc-2023.201.1.1bsvn66008-53.1.noarch.rpm"
RPM_HASH = "edf0bb6a238d8c4160162ff03447327ef39c59b24b46d7d58fc9a117173b72b1489a8135f8db372df032da51d2c0173441d2193fa672a76a6094209fab33d6f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recorder-fingering-doc"

RDEPENDS:${PN} += ""

inherit rpm
