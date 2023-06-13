SUMMARY = "Documentation for texlive-xhfill"
DESCRIPTION = "This package includes the documentation for texlive-xhfill"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn22575"

RPM_NAME = "texlive-xhfill-doc-2023.201.1.01svn22575-52.1.noarch.rpm"
RPM_HASH = "26c5a651e58b872c250c0f44122d9c25e09b1de208aa866594b5ff7a684fd5e0e44b73aec0861d525920d717475b33c10e2ca4805016675681f2c69d5aca608e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xhfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
