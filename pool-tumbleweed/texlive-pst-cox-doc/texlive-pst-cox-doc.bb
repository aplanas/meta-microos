SUMMARY = "Documentation for texlive-pst-cox"
DESCRIPTION = "This package includes the documentation for texlive-pst-cox"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-doc-2023.201.0.0.98_betasvn15878-52.1.noarch.rpm"
RPM_HASH = "ed1fff850d4dd8f5ea0ea5cfab716209002054780d9aecfbaa35857910d79b978d30fc94781a8bfacc12195319a3ec306cfc90b072ec169a7649de6f78600e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-cox-doc:en) \
texlive-pst-cox-doc"
RDEPENDS:${PN} += ""

inherit rpm
