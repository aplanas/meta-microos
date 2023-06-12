SUMMARY = "Documentation for texlive-uwa-colours"
DESCRIPTION = "This package includes the documentation for texlive-uwa-colours"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn60443"

RPM_NAME = "texlive-uwa-colours-doc-2023.201.1.0.0svn60443-53.1.noarch.rpm"
RPM_HASH = "902291a09af1045b34d37323746a5d8b3a71fa3ddba83f90b7a705441ef76d76629f4eaaf77b280386e04e0ed71c5ed895f82732e8de727ad5b6e9510ab23f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-colours-doc"
RDEPENDS:${PN} += ""

inherit rpm
