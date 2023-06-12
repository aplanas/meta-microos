SUMMARY = "Documentation for texlive-crimsonpro"
DESCRIPTION = "This package includes the documentation for texlive-crimsonpro"
LICENSE = "OFL-1.1"

PV = "2023.204.svn64565"

RPM_NAME = "texlive-crimsonpro-doc-2023.204.svn64565-54.1.noarch.rpm"
RPM_HASH = "a4d1a855428dea99783abce33fe0bf7e560ac2eceacb5e09f0bac3af05b8e4f5fb92c50ddb3e76cfa7be6f7305060163027527ea5cfef2e54a697f72f3d5690a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimsonpro-doc"
RDEPENDS:${PN} += ""

inherit rpm
