SUMMARY = "Documentation for texlive-latex-papersize"
DESCRIPTION = "This package includes the documentation for texlive-latex-papersize"
LICENSE = "Apache-1.0"

PV = "2023.209.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-doc-2023.209.1.63svn53131-56.1.noarch.rpm"
RPM_HASH = "a57b1098927b0cd7e59bd0317bdfc11510c886dbcb95f1c5e3af3597d57fc6a369a4cfcfbe4692e0669d093c13cb5f63525e4656988c7eb9d59c719bb9b152bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize-doc"

RDEPENDS:${PN} += ""

inherit rpm
