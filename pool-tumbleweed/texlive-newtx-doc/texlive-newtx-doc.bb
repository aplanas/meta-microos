SUMMARY = "Documentation for texlive-newtx"
DESCRIPTION = "This package includes the documentation for texlive-newtx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.71svn62369"

RPM_NAME = "texlive-newtx-doc-2023.201.1.71svn62369-54.1.noarch.rpm"
RPM_HASH = "b74cedbe3f78d2c8c8679f222c50ceac5a45ee2d3437bc609ce87b31a398289d6645b291012ce7d6e18bc7a187048ccd6bdf2b6b27d51a003072f094d905cf96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
