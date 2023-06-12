SUMMARY = "Support package for XML/SGML typesetting"
DESCRIPTION = "Packages providing XML parsing, UTF-8 parsing, Unicode \
entities, and common formatting object definitions for jadetex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-passivetex-2023.201.svn15878-51.1.noarch.rpm"
RPM_HASH = "1c126a5893dfa1f205989a5d34088f796b4a2fcda0fedd7da2118b5add92bed9402097b75f8908c275374858d9f3d825bfef31300092983f78d926d1dc1fe4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dummyels.sty) \
tex(fotex.sty) \
tex(mlnames.sty) \
tex(teixml.sty) \
tex(teixmlslides.sty) \
tex(ucharacters.sty) \
tex(unicode.sty) \
texlive-passivetex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(array.sty) \
tex(bm.sty) \
tex(color.sty) \
tex(eucal.sty) \
tex(fontenc.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(longtable.sty) \
tex(marvosym.sty) \
tex(multicol.sty) \
tex(nameref.sty) \
tex(pifont.sty) \
tex(rotating.sty) \
tex(stmaryrd.sty) \
tex(textcomp.sty) \
tex(times.sty) \
tex(tipa.sty) \
tex(tone.sty) \
tex(ulem.sty) \
tex(url.sty) \
tex(wasysym.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
