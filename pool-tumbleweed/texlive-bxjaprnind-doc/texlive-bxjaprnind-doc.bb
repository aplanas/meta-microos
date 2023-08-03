SUMMARY = "Documentation for texlive-bxjaprnind"
DESCRIPTION = "This package includes the documentation for texlive-bxjaprnind"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-doc-2023.209.0.0.4asvn59641-53.1.noarch.rpm"
RPM_HASH = "9326a3c134fb316e1f1a59a2d56dd5df63a1bce85305e471cae9ab04580914acf2a8e8cb20268d90f03e49ab920daf30b47045d90ab09bee6fe81a67268b950f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjaprnind-doc-ja \
texlive-bxjaprnind-doc"

RDEPENDS:${PN} += ""

inherit rpm
