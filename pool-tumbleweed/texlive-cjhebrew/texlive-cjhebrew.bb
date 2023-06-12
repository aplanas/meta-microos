SUMMARY = "Typeset Hebrew with LaTeX"
DESCRIPTION = "The cjhebrew package provides Adobe Type 1 fonts for Hebrew, \
and LaTeX macros to support their use. Hebrew text can be \
vocalised, and a few accents are also available. The package \
makes it easy to include Hebrew text in other-language \
documents. The package makes use of the e-TeX extensions to \
TeX, so should be run using an 'e-LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-2023.201.0.0.2asvn43444-53.1.noarch.rpm"
RPM_HASH = "bc2189d3d012dd471c9d83d1c58a6dbd731888ec49cca077c15998639ef9021e6a52b516330ed8aec85a4746675a85f2b16fad80e5a45de129cc8c6c0a8046b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cjhblsm.tfm) \
tex(cjhblsm.vf) \
tex(cjhbltx.tfm) \
tex(cjhbltx.vf) \
tex(cjheblsm.tfm) \
tex(cjhebltx.enc) \
tex(cjhebltx.tfm) \
tex(cjhebrew.map) \
tex(cjhebrew.sty) \
tex(rcjhblsm.tfm) \
tex(rcjhbltx.tfm) \
texlive-cjhebrew"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(luabidi.sty) \
tex(updmap.cfg) \
texlive \
texlive-cjhebrew-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
