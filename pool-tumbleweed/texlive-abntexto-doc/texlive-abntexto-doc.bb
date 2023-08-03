SUMMARY = "Documentation for texlive-abntexto"
DESCRIPTION = "This package includes the documentation for texlive-abntexto"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0.0_alphasvn65705"

RPM_NAME = "texlive-abntexto-doc-2023.209.2.0.0_alphasvn65705-55.1.noarch.rpm"
RPM_HASH = "bf4f7b61f683fdec8892977eee58e67612b8d080c936e242d557da43a65ff0c1753e18660cb5ebafb518a280f1657c12e5dce4087ce8dc9dec9facbc74f25e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abntexto-doc-pt-BR \
texlive-abntexto-doc"

RDEPENDS:${PN} += ""

inherit rpm
