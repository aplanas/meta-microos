SUMMARY = "Documentation for texlive-gaceta"
DESCRIPTION = "This package includes the documentation for texlive-gaceta"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn15878"

RPM_NAME = "texlive-gaceta-doc-2023.201.1.06svn15878-52.1.noarch.rpm"
RPM_HASH = "bd894ef5ad6f3206c3da06f2b14d281abcc56e5e55f767657ffa934aaa9fd66eab591b0bfa3f22b41e00435fe88f9829035b8bea3feb6fc60a67e9d6824eced7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-gaceta-doc:es) \
texlive-gaceta-doc"
RDEPENDS:${PN} += ""

inherit rpm
