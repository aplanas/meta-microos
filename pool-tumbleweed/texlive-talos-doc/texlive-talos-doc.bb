SUMMARY = "Documentation for texlive-talos"
DESCRIPTION = "This package includes the documentation for texlive-talos"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.0svn61820"

RPM_NAME = "texlive-talos-doc-2023.201.1.0svn61820-54.1.noarch.rpm"
RPM_HASH = "1ee510284d7b8d4aec5c3bcca0dcdca72908379f439b13f72c783891d06e76a470cd7dc3f4b45f006fee7d7b0b2e072965978d6e3d985244c6162394f6134cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos-doc"
RDEPENDS:${PN} += ""

inherit rpm
