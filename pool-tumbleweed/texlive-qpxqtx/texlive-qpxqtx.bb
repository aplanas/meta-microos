SUMMARY = "Polish macros and fonts supporting Pagella/pxfonts and Termes/txfonts"
DESCRIPTION = "The qpxqtx package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45797"

RPM_NAME = "texlive-qpxqtx-2023.201.svn45797-53.2.noarch.rpm"
RPM_HASH = "745443beecbf0fcde5d08f9bda8344c7852c358f70069bcd466ac11b82658a44c34cd678b73207f8afe33deec22a5f34c3aee04dbfb814db9e19c482e8b3aa88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amspbold.tex \
tex-amsqpx.def \
tex-amsqpx.tex \
tex-amsqtx.def \
tex-amsqtx.tex \
tex-amstbold.tex \
tex-qpxbmi.tfm \
tex-qpxbmi.vf \
tex-qpxbmia.tfm \
tex-qpxbmia.vf \
tex-qpxmath.sty \
tex-qpxmath.tex \
tex-qpxmi.tfm \
tex-qpxmi.vf \
tex-qpxmia.tfm \
tex-qpxmia.vf \
tex-qtxbmi.tfm \
tex-qtxbmi.vf \
tex-qtxbmia.tfm \
tex-qtxbmia.vf \
tex-qtxmath.sty \
tex-qtxmath.tex \
tex-qtxmi.tfm \
tex-qtxmi.vf \
tex-qtxmia.tfm \
tex-qtxmia.vf \
texlive-qpxqtx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pxbmia.tfm \
tex-pxbsya.tfm \
tex-pxmia.tfm \
tex-pxsya.tfm \
tex-qx-qplbi.tfm \
tex-qx-qplri.tfm \
tex-qx-qtmbi.tfm \
tex-qx-qtmri.tfm \
tex-rm-qplb.tfm \
tex-rm-qplbi.tfm \
tex-rm-qplr.tfm \
tex-rm-qplri.tfm \
tex-rm-qtmb.tfm \
tex-rm-qtmbi.tfm \
tex-rm-qtmr.tfm \
tex-rm-qtmri.tfm \
tex-rpxb.tfm \
tex-rpxbmi.tfm \
tex-rpxmi.tfm \
tex-rpxr.tfm \
tex-rtxb.tfm \
tex-rtxbmi.tfm \
tex-rtxmi.tfm \
tex-rtxr.tfm \
tex-ts1-qplb.tfm \
tex-ts1-qplr.tfm \
tex-ts1-qtmb.tfm \
tex-ts1-qtmr.tfm \
tex-txbsya.tfm \
tex-txsya.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
