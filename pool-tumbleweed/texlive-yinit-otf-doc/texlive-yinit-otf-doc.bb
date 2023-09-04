SUMMARY = "Documentation for texlive-yinit-otf"
DESCRIPTION = "This package includes the documentation for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-doc-2023.209.1.0svn40207-53.2.noarch.rpm"
RPM_HASH = "e09cf38bbf7a06d38f9a0b54b60a10ad0f784c93a8ede6802a3b61f3b40c3e0ec91c5e6bae219ab02b35a607fb11834bfa5605a2d92922b40587ef3c744e28a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
