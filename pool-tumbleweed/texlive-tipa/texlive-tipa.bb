SUMMARY = "Fonts and macros for IPA phonetics characters"
DESCRIPTION = "These fonts are considered the 'ultimate answer' to IPA \
typesetting. The encoding of these 8-bit fonts has been \
registered as LaTeX standard encoding T3, and the set of \
addendum symbols as encoding TS3. 'Times-like' Adobe Type 1 \
versions are provided for both the T3 and the TS3 fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn29349"

RPM_NAME = "texlive-tipa-2023.209.1.3svn29349-53.1.noarch.rpm"
RPM_HASH = "0cb8521ef2bfffac50cae19c2c271d4300fc352cb285eac87e7285bf16ff916c9b2439cf856839a93dd4fa07eba3fc814b5796fa8f98d4b4fb0f59bf065cdf03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exaccent.sty \
tex-extraipa.sty \
tex-t3cmr.fd \
tex-t3cmss.fd \
tex-t3cmtt.fd \
tex-t3enc.def \
tex-t3phv.fd \
tex-t3ptm.fd \
tex-tipa.map \
tex-tipa.sty \
tex-tipa10.tfm \
tex-tipa12.tfm \
tex-tipa17.tfm \
tex-tipa8.tfm \
tex-tipa9.tfm \
tex-tipab10.tfm \
tex-tipabs10.tfm \
tex-tipabx10.tfm \
tex-tipabx12.tfm \
tex-tipabx8.tfm \
tex-tipabx9.tfm \
tex-tipaprm.def \
tex-tipasb10.tfm \
tex-tipasi10.tfm \
tex-tipasl10.tfm \
tex-tipasl12.tfm \
tex-tipasl8.tfm \
tex-tipasl9.tfm \
tex-tipass10.tfm \
tex-tipass12.tfm \
tex-tipass17.tfm \
tex-tipass8.tfm \
tex-tipass9.tfm \
tex-tipats10.tfm \
tex-tipatt10.tfm \
tex-tipatt12.tfm \
tex-tipatt8.tfm \
tex-tipatt9.tfm \
tex-tipx.sty \
tex-tipx10.tfm \
tex-tipx12.tfm \
tex-tipx17.tfm \
tex-tipx8.tfm \
tex-tipx9.tfm \
tex-tipxb10.tfm \
tex-tipxbs10.tfm \
tex-tipxbx10.tfm \
tex-tipxbx12.tfm \
tex-tipxbx8.tfm \
tex-tipxbx9.tfm \
tex-tipxsb10.tfm \
tex-tipxsi10.tfm \
tex-tipxsl10.tfm \
tex-tipxsl12.tfm \
tex-tipxsl8.tfm \
tex-tipxsl9.tfm \
tex-tipxss10.tfm \
tex-tipxss12.tfm \
tex-tipxss17.tfm \
tex-tipxss8.tfm \
tex-tipxss9.tfm \
tex-tipxts10.tfm \
tex-tipxtt10.tfm \
tex-tipxtt12.tfm \
tex-tipxtt8.tfm \
tex-tipxtt9.tfm \
tex-tone.sty \
tex-ts3cmr.fd \
tex-ts3cmss.fd \
tex-ts3cmtt.fd \
tex-ts3enc.def \
tex-ts3phv.fd \
tex-ts3ptm.fd \
tex-utipx.fd \
tex-utipxss.fd \
tex-utipxtt.fd \
tex-uxipx.fd \
tex-uxipxss.fd \
tex-vowel.sty \
tex-xipa10.tfm \
tex-xipab10.tfm \
tex-xipabs10.tfm \
tex-xipaprm.def \
tex-xipasb10.tfm \
tex-xipasi10.tfm \
tex-xipasl10.tfm \
tex-xipass10.tfm \
tex-xipx10.tfm \
tex-xipxb10.tfm \
tex-xipxbs10.tfm \
tex-xipxsb10.tfm \
tex-xipxsi10.tfm \
tex-xipxsl10.tfm \
tex-xipxss10.tfm \
texlive-tipa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tipa-fonts"

inherit rpm
