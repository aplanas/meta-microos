SUMMARY = "Documentation for texlive-scanpages"
DESCRIPTION = "This package includes the documentation for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05asvn42633"

RPM_NAME = "texlive-scanpages-doc-2023.209.1.05asvn42633-54.1.noarch.rpm"
RPM_HASH = "b20b98fbfcdde73861d17a5f71124655e02191ee9e343941239f9df918bec20dc952f93d08cc3325bc0ff08ab7dfcab30dbe1d06428e7bb62bd4752b8aef2033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scanpages-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
