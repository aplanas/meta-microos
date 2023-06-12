SUMMARY = "Documentation for texlive-elements"
DESCRIPTION = "This package includes the documentation for texlive-elements"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61792"

RPM_NAME = "texlive-elements-doc-2023.201.0.0.4svn61792-53.1.noarch.rpm"
RPM_HASH = "8076921d3895ef69be367a94bf0ae78d833ad36dfd2384600376ae4f29b6112582fdb891e41cb2ab7ffd9e17c58fcf9964e59739a148f38eddd868532064fc3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elements-doc"
RDEPENDS:${PN} += ""

inherit rpm
