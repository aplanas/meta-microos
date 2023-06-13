SUMMARY = "Documentation for texlive-errata"
DESCRIPTION = "This package includes the documentation for texlive-errata"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn42428"

RPM_NAME = "texlive-errata-doc-2023.201.0.0.3svn42428-53.1.noarch.rpm"
RPM_HASH = "fbb17663ad76773ae3a85e37a0da73621affac7f0c51d85189fb3968c9066e83a29bad334a4c324fb428a5c83b707bd82f191fd5cd68e3d663940b4b58437eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-errata-doc"

RDEPENDS:${PN} += ""

inherit rpm
