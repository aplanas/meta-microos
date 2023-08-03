SUMMARY = "Documentation for texlive-hf-tikz"
DESCRIPTION = "This package includes the documentation for texlive-hf-tikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn34733"

RPM_NAME = "texlive-hf-tikz-doc-2023.209.0.0.3asvn34733-54.1.noarch.rpm"
RPM_HASH = "355047b5a6f0ccc447849f79aafe6f0fea7433ba59e8ac206cb33982caf295bce05b9bab0b393e6168d44a63a5d65dc9bfc8f51a79fb8a029a2d8888a0beaf5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hf-tikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
