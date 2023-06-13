SUMMARY = "Documentation for texlive-xespotcolor"
DESCRIPTION = "This package includes the documentation for texlive-xespotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-doc-2023.201.2.1svn58212-52.1.noarch.rpm"
RPM_HASH = "36715fa0e4f8d207fc0ea8b0c842fa9b478809f861b008b1aeaa09d071c6910714ed6b16659e7355d2491cc421b385d9b0e0914bfbef9c06f73502ac2e4445a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xespotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
