SUMMARY = "Documentation for texlive-cnbwp"
DESCRIPTION = "This package includes the documentation for texlive-cnbwp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32550"

RPM_NAME = "texlive-cnbwp-doc-2023.201.svn32550-53.1.noarch.rpm"
RPM_HASH = "cae27806c732320b7edbb7561e389ab43d3979b7eed0d0622efb0f3434f1cc83e7daf248fd8de8dc89040db9ca1cd7513cd8613a031c3b07bbe181d41d0b6656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnbwp-doc"
RDEPENDS:${PN} += ""

inherit rpm
