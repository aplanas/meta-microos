SUMMARY = "Documentation for texlive-isonums"
DESCRIPTION = "This package includes the documentation for texlive-isonums"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17362"

RPM_NAME = "texlive-isonums-doc-2023.201.1.0svn17362-55.1.noarch.rpm"
RPM_HASH = "9e792893a144e77bfcfff85d60fabd7e14df12f1c264b6002a4f7d4bb07b78d174c1da7514c56ebd32ee1924290f264d4f8c80cc67898e4da46c94d3f3e08e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isonums-doc"
RDEPENDS:${PN} += ""

inherit rpm
