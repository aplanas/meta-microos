SUMMARY = "Documentation for texlive-pst-vehicle"
DESCRIPTION = "This package includes the documentation for texlive-pst-vehicle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-doc-2023.201.1.3svn61438-53.1.noarch.rpm"
RPM_HASH = "da2d96b6d6e3f938b07d25197366e578ddc0d809f1376c8b583365d3008b36ac809d6b187cc0a41a35f9ed6b4544181e3b2ac5c9d9c1ef35679f4eb462002b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vehicle-doc-fr \
texlive-pst-vehicle-doc"

RDEPENDS:${PN} += ""

inherit rpm
