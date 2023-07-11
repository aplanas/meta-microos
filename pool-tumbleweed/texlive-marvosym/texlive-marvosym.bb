SUMMARY = "Martin Vogel's Symbols (marvosym) font"
DESCRIPTION = "Martin Vogel's Symbol font (marvosym) contains the Euro \
currency symbol as defined by the European commission, along \
with symbols for structural engineering; symbols for steel \
cross-sections; astronomy signs (sun, moon, planets); the 12 \
signs of the zodiac; scissor symbols; CE sign and others. The \
package contains both the original TrueType font and the \
derived Type 1 font, together with support files for TeX \
(LaTeX)."
LICENSE = "OFL-1.1"

PV = "2023.208.2.2asvn29349"

RPM_NAME = "texlive-marvosym-2023.208.2.2asvn29349-53.1.noarch.rpm"
RPM_HASH = "31523b37bcf3421c34567b3c53c0374dc9106c6be4175b357f2758e777771383253cab5326416db281cf78ff19df525fae579a96c1edc6d0c0ed54c884480063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marvosym.map \
tex-marvosym.sty \
tex-umvs.fd \
tex-umvs.tfm \
texlive-marvosym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-marvosym-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
