SUMMARY = "Documentation for texlive-interchar"
DESCRIPTION = "This package includes the documentation for texlive-interchar"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn36312"

RPM_NAME = "texlive-interchar-doc-2023.208.0.0.2svn36312-53.1.noarch.rpm"
RPM_HASH = "39db398c58ebaa99c5e0f6549700d3ee1ffd96ed1bb34669e6ea729fd53fc67423a8b2fd653052239d997e5480b2617f2ceddd37fae7bc20a5f4136bfc814955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interchar-doc"

RDEPENDS:${PN} += ""

inherit rpm
