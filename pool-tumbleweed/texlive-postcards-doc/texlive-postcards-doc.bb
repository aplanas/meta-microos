SUMMARY = "Documentation for texlive-postcards"
DESCRIPTION = "This package includes the documentation for texlive-postcards"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21641"

RPM_NAME = "texlive-postcards-doc-2023.201.svn21641-52.1.noarch.rpm"
RPM_HASH = "dcca671dd084608c65b7d1b869d623f52dfc4ed4cb82ef506871cbe2fb7440b7a257f8832eb6df6977122745b87a9828368d96b1d32df9dced8a0b6f691aff0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
