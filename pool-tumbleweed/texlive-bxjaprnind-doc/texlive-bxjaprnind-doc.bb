SUMMARY = "Documentation for texlive-bxjaprnind"
DESCRIPTION = "This package includes the documentation for texlive-bxjaprnind"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn59641"

RPM_NAME = "texlive-bxjaprnind-doc-2023.201.0.0.4asvn59641-52.1.noarch.rpm"
RPM_HASH = "931dc13c3da393ba3dc2ba390dac51860a7904ccfd7a473d14166d2691851e2c85508135113b6166d2b9ddc86dc81f5e7b26e44b9cfa286b4390bbecfa55ee10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxjaprnind-doc-ja \
texlive-bxjaprnind-doc"

RDEPENDS:${PN} += ""

inherit rpm
