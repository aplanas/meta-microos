SUMMARY = "Expanded Times Roman fonts"
DESCRIPTION = "The package offers LaTeX support for the expanded Times Roman \
font, which has been used for many years in the Journal \
d'Analyse Mathematique. Mathematics support is based on the \
Belleek fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn20408"

RPM_NAME = "texlive-jamtimes-2023.201.1.12svn20408-55.1.noarch.rpm"
RPM_HASH = "e8b52039f4d9f03e98aceda3b1cd95c0e71036ed54aa5143354b6ecf1a1e4608f094da3e9a500518a5f27a9daad007168e1c2ca5c9bc57ba7900310b748c6823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blsy.tfm) \
tex(jamtimes.sty) \
tex(jtm.map) \
tex(jtmb7tv.tfm) \
tex(jtmb7tv.vf) \
tex(jtmb8cv.tfm) \
tex(jtmb8cv.vf) \
tex(jtmb8rv.tfm) \
tex(jtmb8tv.tfm) \
tex(jtmb8tv.vf) \
tex(jtmbc7tv.tfm) \
tex(jtmbc7tv.vf) \
tex(jtmbc8tv.tfm) \
tex(jtmbc8tv.vf) \
tex(jtmbi7me.tfm) \
tex(jtmbi7me.vf) \
tex(jtmbi7tv.tfm) \
tex(jtmbi7tv.vf) \
tex(jtmbi8cv.tfm) \
tex(jtmbi8cv.vf) \
tex(jtmbi8rv.tfm) \
tex(jtmbi8tv.tfm) \
tex(jtmbi8tv.vf) \
tex(jtmbo7tv.tfm) \
tex(jtmbo7tv.vf) \
tex(jtmbo8cv.tfm) \
tex(jtmbo8cv.vf) \
tex(jtmbo8rv.tfm) \
tex(jtmbo8tv.tfm) \
tex(jtmbo8tv.vf) \
tex(jtmr7tc.tfm) \
tex(jtmr7tc.vf) \
tex(jtmr7te.tfm) \
tex(jtmr7te.vf) \
tex(jtmr7tw.tfm) \
tex(jtmr7tw.vf) \
tex(jtmr7ye.tfm) \
tex(jtmr7ye.vf) \
tex(jtmr7yoe.tfm) \
tex(jtmr8cc.tfm) \
tex(jtmr8cc.vf) \
tex(jtmr8ce.tfm) \
tex(jtmr8ce.vf) \
tex(jtmr8cw.tfm) \
tex(jtmr8cw.vf) \
tex(jtmr8rc.tfm) \
tex(jtmr8re.tfm) \
tex(jtmr8rw.tfm) \
tex(jtmr8tc.tfm) \
tex(jtmr8tc.vf) \
tex(jtmr8te.tfm) \
tex(jtmr8te.vf) \
tex(jtmr8tw.tfm) \
tex(jtmr8tw.vf) \
tex(jtmrc7te.tfm) \
tex(jtmrc7te.vf) \
tex(jtmrc7tw.tfm) \
tex(jtmrc7tw.vf) \
tex(jtmrc8te.tfm) \
tex(jtmrc8te.vf) \
tex(jtmrc8tw.tfm) \
tex(jtmrc8tw.vf) \
tex(jtmri7me.tfm) \
tex(jtmri7me.vf) \
tex(jtmri7te.tfm) \
tex(jtmri7te.vf) \
tex(jtmri7tw.tfm) \
tex(jtmri7tw.vf) \
tex(jtmri7ze.tfm) \
tex(jtmri8ce.tfm) \
tex(jtmri8ce.vf) \
tex(jtmri8cw.tfm) \
tex(jtmri8cw.vf) \
tex(jtmri8re.tfm) \
tex(jtmri8rw.tfm) \
tex(jtmri8te.tfm) \
tex(jtmri8te.vf) \
tex(jtmri8tw.tfm) \
tex(jtmri8tw.vf) \
tex(jtmro7te.tfm) \
tex(jtmro7te.vf) \
tex(jtmro7tw.tfm) \
tex(jtmro7tw.vf) \
tex(jtmro8ce.tfm) \
tex(jtmro8ce.vf) \
tex(jtmro8cw.tfm) \
tex(jtmro8cw.vf) \
tex(jtmro8re.tfm) \
tex(jtmro8rw.tfm) \
tex(jtmro8te.tfm) \
tex(jtmro8te.vf) \
tex(jtmro8tw.tfm) \
tex(jtmro8tw.vf) \
tex(omljtm.fd) \
tex(omsjtm.fd) \
tex(ot1jtm.fd) \
tex(ptmb8a.tfm) \
tex(ptmbi8a.tfm) \
tex(ptmr8a.tfm) \
tex(ptmri8a.tfm) \
tex(rblmi.tfm) \
tex(t1jtm.fd) \
tex(ts1jtm.fd) \
texlive-jamtimes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(cmmi10.tfm) \
tex(cmmib10.tfm) \
tex(cmsy10.tfm) \
tex(eucal.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
