SUMMARY = "Calligraphic fonts for use with LaTeX in T1 encoding"
DESCRIPTION = "The package that implements a set (AuriocusKalligraphicus) of \
three calligraphic fonts derived from the author's handwriting \
in Adobe Type 1 Format, T1 encoding for use with LaTeX: \
Auriocus Kalligraphicus; Lukas Svatba; and Jana Skrivana. Each \
font features oldstyle digits and (machine-generated) boldface \
and slanted versions. A variant of Lukas Svatba offers a 'long \
s'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-aurical-2023.209.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "0a659ce477a14dc25f899216f439c1407015476382fa88fee6eb08329eecb5a17f2596860cf5daa2130e6661f7b832de86b438de062d6db5ff8d4bd62be31bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AmiciLogo.tfm \
tex-AmiciLogoBold.tfm \
tex-AmiciLogoBoldRslant.tfm \
tex-AmiciLogoBoldSlant.tfm \
tex-AmiciLogoRslant.tfm \
tex-AmiciLogoSlant.tfm \
tex-AuriocusKalligraphicus.tfm \
tex-AuriocusKalligraphicusBold.tfm \
tex-AuriocusKalligraphicusBoldRslant.tfm \
tex-AuriocusKalligraphicusBoldSlant.tfm \
tex-AuriocusKalligraphicusRslant.tfm \
tex-AuriocusKalligraphicusSlant.tfm \
tex-JanaSkrivana.tfm \
tex-JanaSkrivanaBold.tfm \
tex-JanaSkrivanaBoldRslant.tfm \
tex-JanaSkrivanaBoldSlant.tfm \
tex-JanaSkrivanaRslant.tfm \
tex-JanaSkrivanaSlant.tfm \
tex-LukasSvatba.tfm \
tex-LukasSvatbaBold.tfm \
tex-LukasSvatbaBoldRslant.tfm \
tex-LukasSvatbaBoldSlant.tfm \
tex-LukasSvatbaRslant.tfm \
tex-LukasSvatbaSlant.tfm \
tex-T1AmiciLogo.fd \
tex-T1AuriocusKalligraphicus.fd \
tex-T1JanaSkrivana.fd \
tex-T1LukasSvatba.fd \
tex-aurical.map \
tex-aurical.sty \
texlive-aurical"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-aurical-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
