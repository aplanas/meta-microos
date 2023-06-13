SUMMARY = "Documentation for texlive-cmathbb"
DESCRIPTION = "This package includes the documentation for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56414"

RPM_NAME = "texlive-cmathbb-doc-2023.201.1.0svn56414-53.1.noarch.rpm"
RPM_HASH = "c0e5797c3f37fe2536febb8fa71eee71b6d8bf31623ab5b43dfee62b6d269d403eada4ef45e49d186ab1ce1c6bc7040658059c79a45aecf8d1d541fc67d7186b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmathbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
