SUMMARY = "Documentation for texlive-willowtreebook"
DESCRIPTION = "This package includes the documentation for texlive-willowtreebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn60638"

RPM_NAME = "texlive-willowtreebook-doc-2023.201.1.03svn60638-53.1.noarch.rpm"
RPM_HASH = "5de1503eabf70f4da6c15bbb20c23cf7bf7173111c4544c2257e7a096fcbc65e73564e7ea7668a93613bede59ddaaf911e9ed5c49e67629b5bab7180a4def375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-willowtreebook-doc"
RDEPENDS:${PN} += ""

inherit rpm
