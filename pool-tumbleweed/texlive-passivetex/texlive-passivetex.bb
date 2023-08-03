SUMMARY = "Support package for XML/SGML typesetting"
DESCRIPTION = "Packages providing XML parsing, UTF-8 parsing, Unicode \
entities, and common formatting object definitions for jadetex."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-passivetex-2023.209.svn15878-52.1.noarch.rpm"
RPM_HASH = "42aec2cdc65ad710d6a5a994b784ef49564a76106941c207e4b94c42508ecf52c76c60ae3beb60b9e2c486b274d0cdcec4e1e99fe7c7d766031d4ab59a0dfecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dummyels.sty \
tex-fotex.sty \
tex-mlnames.sty \
tex-teixml.sty \
tex-teixmlslides.sty \
tex-ucharacters.sty \
tex-unicode.sty \
texlive-passivetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-bm.sty \
tex-color.sty \
tex-eucal.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-multicol.sty \
tex-nameref.sty \
tex-pifont.sty \
tex-rotating.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-times.sty \
tex-tipa.sty \
tex-tone.sty \
tex-ulem.sty \
tex-url.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
