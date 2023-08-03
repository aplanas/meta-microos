SUMMARY = "Typeset Devanagari"
DESCRIPTION = "Frans Velthuis' preprocessor for Devanagari text, and fonts and \
macros to use when typesetting the processed text. The macros \
provide features that support Sanskrit, Hindi, Marathi, Nepali, \
and other languages typically printed in the Devanagari script. \
The package provides fonts, in both Metafont and Type 1 \
formats. Users of modern TeX distributions may care to try the \
XeTeX based package, which is far preferable for users who can \
type Unicode text."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-2023.209.2.17.1svn66186-54.1.noarch.rpm"
RPM_HASH = "e920c83e4db6f8ba0e76534523824c0e761c1aa0aa16b89bd21ffac9a434649cad684e829471208b6dea110c568fbbd4eea59031119a003445994dffa10371d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dev.sty \
tex-dev209.sty \
tex-devanagari.sty \
tex-dnmacs.tex \
tex-dvnb10.tfm \
tex-dvnb8.tfm \
tex-dvnb9.tfm \
tex-dvnbb10.tfm \
tex-dvnbb8.tfm \
tex-dvnbb9.tfm \
tex-dvnbbi10.tfm \
tex-dvnbbi8.tfm \
tex-dvnbbi9.tfm \
tex-dvnbi10.tfm \
tex-dvnbi8.tfm \
tex-dvnbi9.tfm \
tex-dvnc10.tfm \
tex-dvnc8.tfm \
tex-dvnc9.tfm \
tex-dvncb10.tfm \
tex-dvncb8.tfm \
tex-dvncb9.tfm \
tex-dvncbi10.tfm \
tex-dvncbi8.tfm \
tex-dvncbi9.tfm \
tex-dvnci10.tfm \
tex-dvnci8.tfm \
tex-dvnci9.tfm \
tex-dvng.map \
tex-dvng10.tfm \
tex-dvng8.tfm \
tex-dvng9.tfm \
tex-dvngb10.tfm \
tex-dvngb8.tfm \
tex-dvngb9.tfm \
tex-dvngbi10.tfm \
tex-dvngbi8.tfm \
tex-dvngbi9.tfm \
tex-dvngcite.sty \
tex-dvngi10.tfm \
tex-dvngi8.tfm \
tex-dvngi9.tfm \
tex-dvnn10.tfm \
tex-dvnn8.tfm \
tex-dvnn9.tfm \
tex-dvnnb10.tfm \
tex-dvnnb8.tfm \
tex-dvnnb9.tfm \
tex-dvnnbi10.tfm \
tex-dvnnbi8.tfm \
tex-dvnnbi9.tfm \
tex-dvnni10.tfm \
tex-dvnni8.tfm \
tex-dvnni9.tfm \
tex-dvpb10.tfm \
tex-dvpb8.tfm \
tex-dvpb9.tfm \
tex-dvpc10.tfm \
tex-dvpc8.tfm \
tex-dvpc9.tfm \
tex-dvpn10.tfm \
tex-dvpn8.tfm \
tex-dvpn9.tfm \
tex-dvpnn10.tfm \
tex-dvpnn8.tfm \
tex-dvpnn9.tfm \
tex-hindi.ldf \
tex-hindi.sty \
tex-hindicaptions.sty \
tex-udn.fd \
tex-udnb.fd \
tex-udnc.fd \
tex-udnn.fd \
tex-udnp.fd \
tex-udnpb.fd \
tex-udnpc.fd \
tex-udnpn.fd \
texlive-velthuis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
tex-ifxetex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-velthuis-bin \
texlive-velthuis-fonts \
texlive-xetex-devanagari"

inherit rpm
