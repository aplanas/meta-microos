SUMMARY = "Palatino-like fonts in support of mathematics"
DESCRIPTION = "Pxfonts supplies virtual text roman fonts using Adobe Palatino \
(or URWPalladioL) with some modified and additional text \
symbols in the OT1, T1, and TS1 encodings; maths alphabets \
using Palatino/Palladio; maths fonts providing all the symbols \
of the Computer Modern and AMS fonts, including all the Greek \
capital letters from CMR; and additional maths fonts of various \
other symbols. The set is complemented by a sans-serif set of \
text fonts, based on Helvetica/NimbusSanL, and a monospace set \
derived from the parallel TX font set. All the fonts are in \
Type 1 format (AFM and PFB files), and are supported by TeX \
metrics (VF and TFM files) and macros for use with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pxfonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "839fc0c86776b1f5baed206f109a238d3eeb7093ebcc10c0b9be10145eafa7aab083e39864d43f74665641bf23370d4eb84800f4e76c5967c3093e8823591336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-omlpxmi.fd \
tex-omlpxr.fd \
tex-omspxr.fd \
tex-omspxsy.fd \
tex-omxpxex.fd \
tex-ot1pxr.fd \
tex-ot1pxss.fd \
tex-ot1pxtt.fd \
tex-p1xb.tfm \
tex-p1xb.vf \
tex-p1xbi.tfm \
tex-p1xbi.vf \
tex-p1xbsc.tfm \
tex-p1xbsc.vf \
tex-p1xbsl.tfm \
tex-p1xbsl.vf \
tex-p1xi.tfm \
tex-p1xi.vf \
tex-p1xr.tfm \
tex-p1xr.vf \
tex-p1xsc.tfm \
tex-p1xsc.vf \
tex-p1xsl.tfm \
tex-p1xsl.vf \
tex-pcxb.tfm \
tex-pcxb.vf \
tex-pcxbi.tfm \
tex-pcxbi.vf \
tex-pcxbsl.tfm \
tex-pcxbsl.vf \
tex-pcxi.tfm \
tex-pcxi.vf \
tex-pcxr.tfm \
tex-pcxr.vf \
tex-pcxsl.tfm \
tex-pcxsl.vf \
tex-pxb.tfm \
tex-pxb.vf \
tex-pxbex.tfm \
tex-pxbexa.tfm \
tex-pxbi.tfm \
tex-pxbi.vf \
tex-pxbmi.tfm \
tex-pxbmi.vf \
tex-pxbmi1.tfm \
tex-pxbmi1.vf \
tex-pxbmia.tfm \
tex-pxbsc.tfm \
tex-pxbsc.vf \
tex-pxbsl.tfm \
tex-pxbsl.vf \
tex-pxbsy.tfm \
tex-pxbsya.tfm \
tex-pxbsyb.tfm \
tex-pxbsyc.tfm \
tex-pxex.tfm \
tex-pxexa.tfm \
tex-pxfonts.map \
tex-pxfonts.sty \
tex-pxi.tfm \
tex-pxi.vf \
tex-pxmi.tfm \
tex-pxmi.vf \
tex-pxmi1.tfm \
tex-pxmi1.vf \
tex-pxmia.tfm \
tex-pxr.map \
tex-pxr.tfm \
tex-pxr.vf \
tex-pxr1.map \
tex-pxr2.map \
tex-pxr3.map \
tex-pxsc.tfm \
tex-pxsc.vf \
tex-pxsl.tfm \
tex-pxsl.vf \
tex-pxsy.tfm \
tex-pxsya.tfm \
tex-pxsyb.tfm \
tex-pxsyc.tfm \
tex-rpcxb.tfm \
tex-rpcxbi.tfm \
tex-rpcxbsl.tfm \
tex-rpcxi.tfm \
tex-rpcxr.tfm \
tex-rpcxsl.tfm \
tex-rpxb.tfm \
tex-rpxbi.tfm \
tex-rpxbmi.tfm \
tex-rpxbsc.tfm \
tex-rpxbsl.tfm \
tex-rpxi.tfm \
tex-rpxmi.tfm \
tex-rpxpplb.tfm \
tex-rpxpplbi.tfm \
tex-rpxpplbo.tfm \
tex-rpxpplr.tfm \
tex-rpxpplri.tfm \
tex-rpxpplro.tfm \
tex-rpxr.tfm \
tex-rpxsc.tfm \
tex-rpxsl.tfm \
tex-t1pxr.fd \
tex-t1pxss.fd \
tex-t1pxtt.fd \
tex-ts1pxr.fd \
tex-ts1pxss.fd \
tex-ts1pxtt.fd \
tex-upxexa.fd \
tex-upxmia.fd \
tex-upxr.fd \
tex-upxss.fd \
tex-upxsya.fd \
tex-upxsyb.fd \
tex-upxsyc.fd \
tex-upxtt.fd \
texlive-pxfonts"

RDEPENDS:${PN} += "/bin/sh \
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
texlive-pxfonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
