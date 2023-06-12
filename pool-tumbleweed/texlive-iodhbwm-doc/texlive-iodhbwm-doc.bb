SUMMARY = "Documentation for texlive-iodhbwm"
DESCRIPTION = "This package includes the documentation for texlive-iodhbwm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-doc-2023.201.1.2.2svn57773-52.1.noarch.rpm"
RPM_HASH = "c912e7f6d3f24009936aac0b408626759906aef3d721d38775d07b72a972591cc620a48d9c95708a9443e7adfd45c515b551659006b4bf1dd534a799f416c24c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-iodhbwm-doc:de) \
texlive-iodhbwm-doc"
RDEPENDS:${PN} += ""

inherit rpm
