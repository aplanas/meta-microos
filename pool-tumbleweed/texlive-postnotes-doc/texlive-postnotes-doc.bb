SUMMARY = "Documentation for texlive-postnotes"
DESCRIPTION = "This package includes the documentation for texlive-postnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.3svn66019"

RPM_NAME = "texlive-postnotes-doc-2023.201.0.0.2.3svn66019-52.1.noarch.rpm"
RPM_HASH = "ed2ecd9d32f0bc74286c16f8ece63841148fdd0f989872e33768f0554f662649d1587d70a4be9a19c36bb2f8758292e3bc1f482a038bcda13ef60be227843772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
