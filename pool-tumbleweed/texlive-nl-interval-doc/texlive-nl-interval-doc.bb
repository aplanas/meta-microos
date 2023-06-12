SUMMARY = "Documentation for texlive-nl-interval"
DESCRIPTION = "This package includes the documentation for texlive-nl-interval"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn58328"

RPM_NAME = "texlive-nl-interval-doc-2023.201.1.0svn58328-54.1.noarch.rpm"
RPM_HASH = "969d4ae0a68a5aa502365ba6bc0d45347f63eab63f3c0e8f9d0c36ea045d0a3b8d78d4d47c44405e4c64dd325752b7c50cb0bfaf153d0857da2527e2695c038e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nl-interval-doc"
RDEPENDS:${PN} += ""

inherit rpm
