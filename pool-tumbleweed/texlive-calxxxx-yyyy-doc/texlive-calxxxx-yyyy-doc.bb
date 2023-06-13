SUMMARY = "Documentation for texlive-calxxxx-yyyy"
DESCRIPTION = "This package includes the documentation for texlive-calxxxx-yyyy"
LICENSE = "LPPL-1.0"

PV = "2023.201.20.23asvn65426"

RPM_NAME = "texlive-calxxxx-yyyy-doc-2023.201.20.23asvn65426-52.1.noarch.rpm"
RPM_HASH = "6ae4e6031cd8ebbe459d7279a809a76a6cadb3eff4c7504a4ab2fc37ce12656e046d169d71c5a9aaef0650c9fec37d27b3b5c26d28d9b5b61c4e7040583e26bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calxxxx-yyyy-doc"

RDEPENDS:${PN} += ""

inherit rpm
