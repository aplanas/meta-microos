SUMMARY = "Documentation for texlive-zztex"
DESCRIPTION = "This package includes the documentation for texlive-zztex"
LICENSE = "LPPL-1.0"

PV = "2023.201.17.7svn55862"

RPM_NAME = "texlive-zztex-doc-2023.201.17.7svn55862-52.2.noarch.rpm"
RPM_HASH = "5be2730c75852e12a4bea5c1a54e4b71209be9eb0cee7797c853c27a7b1cddb02cb5fb3caff66edd8937f349d0595fda87c8bfbf36748f8000b35b8cd774e0b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
