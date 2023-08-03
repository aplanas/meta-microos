SUMMARY = "Times-like fonts in support of mathematics"
DESCRIPTION = "Txfonts supplies virtual text roman fonts using Adobe Times (or \
URW NimbusRomNo9L) with some modified and additional text \
symbols in the OT1, T1, and TS1 encodings; maths alphabets \
using Times/URW Nimbus; maths fonts providing all the symbols \
of the Computer Modern and AMS fonts, including all the Greek \
capital letters from CMR; and additional maths fonts of various \
other symbols. The set is complemented by a sans-serif set of \
text fonts, based on Helvetica/NimbusSanL, and a monospace set. \
All the fonts are in Type 1 format (AFM and PFB files), and are \
supported by TeX metrics (VF and TFM files) and macros for use \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-txfonts-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "efe9992de338de9aa34e6b121e146542f19e93f5571440e7cd11d15766f5a49c986a15d1b8110b71e8c45a4b5d15c0ace243da5b80c68ecd48d3e3bed66021d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ly1txr.fd \
tex-ly1txss.fd \
tex-ly1txtt.fd \
tex-omltxmi.fd \
tex-omltxr.fd \
tex-omstxr.fd \
tex-omstxsy.fd \
tex-omxtxex.fd \
tex-ot1txr.fd \
tex-ot1txss.fd \
tex-ot1txtt.fd \
tex-rtcxb.tfm \
tex-rtcxbi.tfm \
tex-rtcxbsl.tfm \
tex-rtcxbss.tfm \
tex-rtcxbsso.tfm \
tex-rtcxi.tfm \
tex-rtcxr.tfm \
tex-rtcxsl.tfm \
tex-rtcxss.tfm \
tex-rtcxsssl.tfm \
tex-rtxb.tfm \
tex-rtxbi.tfm \
tex-rtxbmi.tfm \
tex-rtxbsc.tfm \
tex-rtxbsl.tfm \
tex-rtxbss.tfm \
tex-rtxbsssc.tfm \
tex-rtxbsssl.tfm \
tex-rtxi.tfm \
tex-rtxmi.tfm \
tex-rtxphvb.tfm \
tex-rtxphvbo.tfm \
tex-rtxphvr.tfm \
tex-rtxphvro.tfm \
tex-rtxptmb.tfm \
tex-rtxptmbi.tfm \
tex-rtxptmbo.tfm \
tex-rtxptmr.tfm \
tex-rtxptmri.tfm \
tex-rtxptmro.tfm \
tex-rtxr.tfm \
tex-rtxsc.tfm \
tex-rtxsl.tfm \
tex-rtxss.tfm \
tex-rtxsssc.tfm \
tex-rtxsssl.tfm \
tex-t1txr.fd \
tex-t1txss.fd \
tex-t1txtt.fd \
tex-t1xb.tfm \
tex-t1xb.vf \
tex-t1xbi.tfm \
tex-t1xbi.vf \
tex-t1xbsc.tfm \
tex-t1xbsc.vf \
tex-t1xbsl.tfm \
tex-t1xbsl.vf \
tex-t1xbss.tfm \
tex-t1xbss.vf \
tex-t1xbsssc.tfm \
tex-t1xbsssc.vf \
tex-t1xbsssl.tfm \
tex-t1xbsssl.vf \
tex-t1xbtt.tfm \
tex-t1xbttsc.tfm \
tex-t1xbttsl.tfm \
tex-t1xi.tfm \
tex-t1xi.vf \
tex-t1xr.tfm \
tex-t1xr.vf \
tex-t1xsc.tfm \
tex-t1xsc.vf \
tex-t1xsl.tfm \
tex-t1xsl.vf \
tex-t1xss.tfm \
tex-t1xss.vf \
tex-t1xsssc.tfm \
tex-t1xsssc.vf \
tex-t1xsssl.tfm \
tex-t1xsssl.vf \
tex-t1xtt.tfm \
tex-t1xttsc.tfm \
tex-t1xttsl.tfm \
tex-tcxb.tfm \
tex-tcxb.vf \
tex-tcxbi.tfm \
tex-tcxbi.vf \
tex-tcxbsl.tfm \
tex-tcxbsl.vf \
tex-tcxbss.tfm \
tex-tcxbss.vf \
tex-tcxbsssl.tfm \
tex-tcxbsssl.vf \
tex-tcxbtt.tfm \
tex-tcxbttsl.tfm \
tex-tcxi.tfm \
tex-tcxi.vf \
tex-tcxr.tfm \
tex-tcxr.vf \
tex-tcxsl.tfm \
tex-tcxsl.vf \
tex-tcxss.tfm \
tex-tcxss.vf \
tex-tcxsssl.tfm \
tex-tcxsssl.vf \
tex-tcxtt.tfm \
tex-tcxttsl.tfm \
tex-ts1txr.fd \
tex-ts1txss.fd \
tex-ts1txtt.fd \
tex-tx8r.enc \
tex-txb.tfm \
tex-txb.vf \
tex-txbex.tfm \
tex-txbexa.tfm \
tex-txbi.tfm \
tex-txbi.vf \
tex-txbmi.tfm \
tex-txbmi.vf \
tex-txbmi1.tfm \
tex-txbmi1.vf \
tex-txbmia.tfm \
tex-txbsc.tfm \
tex-txbsc.vf \
tex-txbsl.tfm \
tex-txbsl.vf \
tex-txbss.tfm \
tex-txbss.vf \
tex-txbsssc.tfm \
tex-txbsssc.vf \
tex-txbsssl.tfm \
tex-txbsssl.vf \
tex-txbsy.tfm \
tex-txbsya.tfm \
tex-txbsyb.tfm \
tex-txbsyc.tfm \
tex-txbtt.tfm \
tex-txbttsc.tfm \
tex-txbttsl.tfm \
tex-txex.tfm \
tex-txexa.tfm \
tex-txfonts.map \
tex-txfonts.sty \
tex-txi.tfm \
tex-txi.vf \
tex-txmi.tfm \
tex-txmi.vf \
tex-txmi1.tfm \
tex-txmi1.vf \
tex-txmia.tfm \
tex-txr.map \
tex-txr.tfm \
tex-txr.vf \
tex-txr1.map \
tex-txr2.map \
tex-txr3.map \
tex-txsc.tfm \
tex-txsc.vf \
tex-txsl.tfm \
tex-txsl.vf \
tex-txss.tfm \
tex-txss.vf \
tex-txsssc.tfm \
tex-txsssc.vf \
tex-txsssl.tfm \
tex-txsssl.vf \
tex-txsy.tfm \
tex-txsya.tfm \
tex-txsyb.tfm \
tex-txsyc.tfm \
tex-txtt.tfm \
tex-txttsc.tfm \
tex-txttsl.tfm \
tex-tyxb.tfm \
tex-tyxb.vf \
tex-tyxbi.tfm \
tex-tyxbi.vf \
tex-tyxbsc.tfm \
tex-tyxbsc.vf \
tex-tyxbsl.tfm \
tex-tyxbsl.vf \
tex-tyxbss.tfm \
tex-tyxbss.vf \
tex-tyxbsssc.tfm \
tex-tyxbsssc.vf \
tex-tyxbsssl.tfm \
tex-tyxbsssl.vf \
tex-tyxbtt.tfm \
tex-tyxbtt.vf \
tex-tyxbttsc.tfm \
tex-tyxbttsc.vf \
tex-tyxbttsl.tfm \
tex-tyxbttsl.vf \
tex-tyxi.tfm \
tex-tyxi.vf \
tex-tyxr.tfm \
tex-tyxr.vf \
tex-tyxsc.tfm \
tex-tyxsc.vf \
tex-tyxsl.tfm \
tex-tyxsl.vf \
tex-tyxss.tfm \
tex-tyxss.vf \
tex-tyxsssc.tfm \
tex-tyxsssc.vf \
tex-tyxsssl.tfm \
tex-tyxsssl.vf \
tex-tyxtt.tfm \
tex-tyxtt.vf \
tex-tyxttsc.tfm \
tex-tyxttsc.vf \
tex-tyxttsl.tfm \
tex-tyxttsl.vf \
tex-utxexa.fd \
tex-utxmia.fd \
tex-utxr.fd \
tex-utxss.fd \
tex-utxsya.fd \
tex-utxsyb.fd \
tex-utxsyc.fd \
tex-utxtt.fd \
texlive-txfonts"

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
texlive-scripts \
texlive-scripts-bin \
texlive-txfonts-fonts"

inherit rpm
