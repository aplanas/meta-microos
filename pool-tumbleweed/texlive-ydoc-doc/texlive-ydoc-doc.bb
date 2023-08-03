SUMMARY = "Documentation for texlive-ydoc"
DESCRIPTION = "This package includes the documentation for texlive-ydoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7alphasvn64887"

RPM_NAME = "texlive-ydoc-doc-2023.209.0.0.7alphasvn64887-53.1.noarch.rpm"
RPM_HASH = "2b1c8213f3e802fa6c149c9279604ccaa8a7a60303d8ab170a8b86fc62e1f22da290ad3f55c2926ecdcd170b89a437e02ffae60607aea1fd3de8844d53c22bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ydoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
