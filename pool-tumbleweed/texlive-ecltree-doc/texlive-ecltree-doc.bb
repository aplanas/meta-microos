SUMMARY = "Documentation for texlive-ecltree"
DESCRIPTION = "This package includes the documentation for texlive-ecltree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-ecltree-doc-2023.209.1.1asvn15878-54.2.noarch.rpm"
RPM_HASH = "481f676d216e43acead21f1e409262b133a835889b6b7eb3de7c1d3894708bb43d7f290fb3c41e2145a40a4659c209334bbbdeb5e3ecf1dada0ee3883793251e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecltree-doc"

RDEPENDS:${PN} += ""

inherit rpm
