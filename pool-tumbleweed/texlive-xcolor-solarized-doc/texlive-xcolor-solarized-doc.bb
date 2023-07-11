SUMMARY = "Documentation for texlive-xcolor-solarized"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-solarized"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-doc-2023.201.0.0.4svn61719-52.2.noarch.rpm"
RPM_HASH = "e6118e0c7708a40f82a9f4c0a9ab52ce9c5bb7815d16a324e29b0bfaea444aae806fc8371220d64bdc2af828e0aadba3446d63e85460b2b77ffc924c60f50cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-solarized-doc"

RDEPENDS:${PN} += ""

inherit rpm
