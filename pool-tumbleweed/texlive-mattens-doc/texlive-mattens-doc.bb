SUMMARY = "Documentation for texlive-mattens"
DESCRIPTION = "This package includes the documentation for texlive-mattens"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3bsvn62326"

RPM_NAME = "texlive-mattens-doc-2023.201.1.3bsvn62326-52.1.noarch.rpm"
RPM_HASH = "31d84c7283b1c5d7a46462ac77cffa2cb3c06eed9566661c4829c5dad0162b7427a47d968d7d04eae450668e475a9041e1b1b08690c1d2d54175d88c75a08a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mattens-doc"
RDEPENDS:${PN} += ""

inherit rpm
