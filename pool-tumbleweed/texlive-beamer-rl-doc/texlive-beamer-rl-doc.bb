SUMMARY = "Documentation for texlive-beamer-rl"
DESCRIPTION = "This package includes the documentation for texlive-beamer-rl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn65725"

RPM_NAME = "texlive-beamer-rl-doc-2023.209.1.8svn65725-54.1.noarch.rpm"
RPM_HASH = "6c53834484ed841da28a7736e204b49b477cf1448d9469e9eb44b7f20f87912d48e06d8b83bdf8d4a174710169248d8b08196958f3f932a19f1e0ba5704b80f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamer-rl-doc-ar;en \
texlive-beamer-rl-doc"

RDEPENDS:${PN} += ""

inherit rpm
