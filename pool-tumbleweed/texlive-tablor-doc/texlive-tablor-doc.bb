SUMMARY = "Documentation for texlive-tablor"
DESCRIPTION = "This package includes the documentation for texlive-tablor"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.07_gsvn31855"

RPM_NAME = "texlive-tablor-doc-2023.209.4.07_gsvn31855-55.1.noarch.rpm"
RPM_HASH = "50ec448b4960ef209993ab8809cab514c02c44a421746506578545648b126dd8969dd4b4f65abcd09f385e87e9d055abf385758d50d20914e34219069e8c6d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tablor-doc-en;fr \
texlive-tablor-doc"

RDEPENDS:${PN} += ""

inherit rpm
