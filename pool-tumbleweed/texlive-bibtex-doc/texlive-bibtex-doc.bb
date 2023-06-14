SUMMARY = "Documentation for texlive-bibtex"
DESCRIPTION = "This package includes the documentation for texlive-bibtex"
LICENSE = "SUSE-TeX"

PV = "2023.201.0.0.99dsvn66186"

RPM_NAME = "texlive-bibtex-doc-2023.201.0.0.99dsvn66186-53.1.noarch.rpm"
RPM_HASH = "d65dbd33eb3969057359012b72bba7ce81f23a4c01313914e710c6088463b6f4caff63814a74b03529e6b96d33695a5f22f253ca21ba86e8c5916d1426ceae78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibtex.1 \
texlive-bibtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
