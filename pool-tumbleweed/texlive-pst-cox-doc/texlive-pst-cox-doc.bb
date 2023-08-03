SUMMARY = "Documentation for texlive-pst-cox"
DESCRIPTION = "This package includes the documentation for texlive-pst-cox"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.98_betasvn15878"

RPM_NAME = "texlive-pst-cox-doc-2023.209.0.0.98_betasvn15878-53.1.noarch.rpm"
RPM_HASH = "78464c8bbc36b9027e9ef86aca2e4869d010d1498ca06f758137c3b9fe38f3c533c1b84c5e9a883fa20304dfcaf1321ac103a30cf81de5f2a507e305081f6c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-cox-doc-en \
texlive-pst-cox-doc"

RDEPENDS:${PN} += ""

inherit rpm
