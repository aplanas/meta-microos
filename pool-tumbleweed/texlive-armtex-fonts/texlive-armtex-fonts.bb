SUMMARY = "Severed fonts for texlive-armtex"
DESCRIPTION = "The  separated fonts package for texlive-armtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0_beta4svn64182"

RPM_NAME = "texlive-armtex-fonts-2023.201.3.0_beta4svn64182-54.1.noarch.rpm"
RPM_HASH = "138496b085e3887ef143ac0becd5400c727474857a8b6b71c11748d1485db1c0f355795983be49db46f923cc832a26b73904ea9d1b2e701f0a0a5d20fae4633d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(arss) \
font(artm) \
texlive-armtex-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
