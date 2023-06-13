SUMMARY = "Documentation for texlive-slideshow"
DESCRIPTION = "This package includes the documentation for texlive-slideshow"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-slideshow-doc-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "bc689647b638224816f3ac1188047636d983f60afbe1b7d98ceba66a683cc4c0dc9b1245731ca7273896a4001c74b0fc7c54c7740ba8446ef6a6d974ae0f1e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slideshow-doc"

RDEPENDS:${PN} += ""

inherit rpm
