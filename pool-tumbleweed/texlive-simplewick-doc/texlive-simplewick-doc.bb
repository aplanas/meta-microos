SUMMARY = "Documentation for texlive-simplewick"
DESCRIPTION = "This package includes the documentation for texlive-simplewick"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2asvn15878"

RPM_NAME = "texlive-simplewick-doc-2023.209.1.2asvn15878-54.1.noarch.rpm"
RPM_HASH = "d37f8917ba54ae59abe5fb0bca2379b8b3f7710974f544c7fdffb1330fd4ee05b737bf3088228fdea13362f9ef489ed170b0de3364220a8e47501669878b9dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplewick-doc"

RDEPENDS:${PN} += ""

inherit rpm
