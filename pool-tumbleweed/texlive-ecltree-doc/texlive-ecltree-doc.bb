SUMMARY = "Documentation for texlive-ecltree"
DESCRIPTION = "This package includes the documentation for texlive-ecltree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-ecltree-doc-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "1cb6a4a5ed7bc41c6b72839bbe7d62350eeda1904dc6ee80c1648e826c0c7ec516a48a4ae65afb44cf315cc2e01cc020e5ce6ef43a05ac856ebec0753c40f974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecltree-doc"

RDEPENDS:${PN} += ""

inherit rpm
