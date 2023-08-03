SUMMARY = "Typeset Hebrew with LaTeX"
DESCRIPTION = "The cjhebrew package provides Adobe Type 1 fonts for Hebrew, \
and LaTeX macros to support their use. Hebrew text can be \
vocalised, and a few accents are also available. The package \
makes it easy to include Hebrew text in other-language \
documents. The package makes use of the e-TeX extensions to \
TeX, so should be run using an 'e-LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-2023.209.0.0.2asvn43444-54.1.noarch.rpm"
RPM_HASH = "d4e3dc79de781f3dc47eccbb7b89561bfb7f61c9544ee078e76c6b5ceedb716994a4b54760e01c305b60fe2d4598811ae87a8cd3226698b8d67323b404c915d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjhblsm.tfm \
tex-cjhblsm.vf \
tex-cjhbltx.tfm \
tex-cjhbltx.vf \
tex-cjheblsm.tfm \
tex-cjhebltx.enc \
tex-cjhebltx.tfm \
tex-cjhebrew.map \
tex-cjhebrew.sty \
tex-rcjhblsm.tfm \
tex-rcjhbltx.tfm \
texlive-cjhebrew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luabidi.sty \
tex-updmap.cfg \
texlive \
texlive-cjhebrew-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
