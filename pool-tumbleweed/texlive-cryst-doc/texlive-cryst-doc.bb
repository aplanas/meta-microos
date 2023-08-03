SUMMARY = "Documentation for texlive-cryst"
DESCRIPTION = "This package includes the documentation for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cryst-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "a2e68f16d37243619e042b1429236c3dc63e79f7ea9a96e9b17b506745ff259f7374207ea2a11f88100fa51fef859a2fef4b2ff3dae86035c126f7a0f9d00550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cryst-doc-de \
texlive-cryst-doc"

RDEPENDS:${PN} += ""

inherit rpm
