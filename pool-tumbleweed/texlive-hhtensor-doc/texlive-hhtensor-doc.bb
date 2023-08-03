SUMMARY = "Documentation for texlive-hhtensor"
DESCRIPTION = "This package includes the documentation for texlive-hhtensor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-doc-2023.209.0.0.61svn54080-54.1.noarch.rpm"
RPM_HASH = "128e8b7ef0455a9afbe98a03d55921fe6fa8752576e12d7da27ea59dfd915e0bc1550d3c56798fb6b9c6db4bd3a57927a7a27f43e89d696389444e6bf58a5f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hhtensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
