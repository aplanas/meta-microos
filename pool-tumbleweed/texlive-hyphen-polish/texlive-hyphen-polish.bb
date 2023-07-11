SUMMARY = "Polish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Polish in QX and UTF-8 encodings. \
These patterns are also used by Polish TeX formats MeX and \
LaMeX."
LICENSE = "SUSE-TeX"

PV = "2023.208.3.0bsvn58609"

RPM_NAME = "texlive-hyphen-polish-2023.208.3.0bsvn58609-53.1.noarch.rpm"
RPM_HASH = "cb0a6012475a21177d428d120a40115323a85bb91bcea73e47d952d9412fb97417457b8694b60bc2bb138d4db098df33e0ef93f70f94ac4adbc85f554fd467a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pl.qx.tex \
tex-hyph-pl.tex \
tex-loadhyph-pl.tex \
texlive-hyphen-polish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
