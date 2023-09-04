SUMMARY = "Documentation for texlive-pst-vehicle"
DESCRIPTION = "This package includes the documentation for texlive-pst-vehicle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-doc-2023.209.1.3svn61438-54.2.noarch.rpm"
RPM_HASH = "1fed3b7ad87900000b8eb481d49f3c5e377c85c406e524b3c3962560d423b554ac780e62095c67000790aebc4de79a8c9c59dab0c36b9372b20510b48b2f6899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-vehicle-doc-fr \
texlive-pst-vehicle-doc"

RDEPENDS:${PN} += ""

inherit rpm
