SUMMARY = "Documentation for texlive-papercdcase"
DESCRIPTION = "This package includes the documentation for texlive-papercdcase"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-papercdcase-doc-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "f26d695a8b5b92198e2317a87d3320fc07b2c45d8763bb5c14ec7ad5acf8d1bd6876a6e5a54d782417e2e38835d721b4e36c99b706850773fda5fb4961d5aea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papercdcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
