SUMMARY = "Documentation for texlive-gtl"
DESCRIPTION = "This package includes the documentation for texlive-gtl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn49527"

RPM_NAME = "texlive-gtl-doc-2023.201.0.0.5svn49527-53.2.noarch.rpm"
RPM_HASH = "51a8c07c53d14cce3a6db72fe3db4085e131f45950f8216574c3f9534082c7d35aac4a9de3ef7ea59c9f62b1da79f68311b4abb5b02866153a1b1a52c38185d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtl-doc"

RDEPENDS:${PN} += ""

inherit rpm
