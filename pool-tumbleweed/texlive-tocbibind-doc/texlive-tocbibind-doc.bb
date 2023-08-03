SUMMARY = "Documentation for texlive-tocbibind"
DESCRIPTION = "This package includes the documentation for texlive-tocbibind"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5ksvn20085"

RPM_NAME = "texlive-tocbibind-doc-2023.209.1.5ksvn20085-53.1.noarch.rpm"
RPM_HASH = "a2d55fb95f7eece73fe78670a390f17415c018a630f0b1780fdb77bbd291eb39f969b1cb189357647adeec69b0f05eac6e005e73cb7cd6318ad8ec84ebdaeefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocbibind-doc"

RDEPENDS:${PN} += ""

inherit rpm
