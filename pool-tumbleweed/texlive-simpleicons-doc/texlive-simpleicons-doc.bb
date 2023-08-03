SUMMARY = "Documentation for texlive-simpleicons"
DESCRIPTION = "This package includes the documentation for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.8.6.0svn66328"

RPM_NAME = "texlive-simpleicons-doc-2023.209.8.6.0svn66328-54.1.noarch.rpm"
RPM_HASH = "cc0a8857be038dd07d8fc766950d88f64cda986ce8ae4eedd394f3c8f2e60aac331c177a05608c613cbe4ce542d49968231804e11df33fc7fb836a8e790db680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simpleicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
