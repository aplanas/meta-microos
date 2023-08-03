SUMMARY = "Documentation for texlive-shdoc"
DESCRIPTION = "This package includes the documentation for texlive-shdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1bsvn41991"

RPM_NAME = "texlive-shdoc-doc-2023.209.2.1bsvn41991-54.1.noarch.rpm"
RPM_HASH = "ab66ea2add45fbddc267ec48d38089f69ed9fba4941a48a0b3a76f974f4d60f279dec5166b0d5c8ce65b25d31178958c4dadb16fc540ef8228903c68465e4c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shdoc-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
