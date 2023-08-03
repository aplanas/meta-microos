SUMMARY = "Libris ADF fonts, with LaTeX support"
DESCRIPTION = "LibrisADF is a sans-serif family designed to mimic Lydian. The \
bundle includes: fonts, in Adobe Type 1, TrueType and OpenType \
formats, and LaTeX support macros, for use with the Type 1 \
versions of the fonts. The LaTeX macros depend on the \
nfssext-cfr bundle. GPL licensing applies the fonts themselves; \
the support macros are distributed under LPPL licensing."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.007svn19409"

RPM_NAME = "texlive-libris-2023.209.1.007svn19409-55.1.noarch.rpm"
RPM_HASH = "f85eef03769d21fc0182ba51358642835305e44440dad04636d351b49b1289e5a7c76a16778d0596bef92cc45f511c4fd9d4394e365770b55f82397e5a657f03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-libris-supp.enc \
tex-libris.sty \
tex-t1-cfr-yly.enc \
tex-t1yly.fd \
tex-t1ylyw.fd \
tex-ts1-euro-yly.enc \
tex-ts1yly.fd \
tex-ts1ylyw.fd \
tex-yly.map \
tex-ylyb-t1.tfm \
tex-ylyb-ts1.tfm \
tex-ylyb8c.tfm \
tex-ylyb8c.vf \
tex-ylyb8s.tfm \
tex-ylyb8t.tfm \
tex-ylyb8t.vf \
tex-ylybi-t1.tfm \
tex-ylybi-ts1.tfm \
tex-ylybi8c.tfm \
tex-ylybi8c.vf \
tex-ylybi8s.tfm \
tex-ylybi8t.tfm \
tex-ylybi8t.vf \
tex-ylybiw8t.tfm \
tex-ylybiw8t.vf \
tex-ylybw8t.tfm \
tex-ylybw8t.vf \
tex-ylyr-t1.tfm \
tex-ylyr-ts1.tfm \
tex-ylyr8c.tfm \
tex-ylyr8c.vf \
tex-ylyr8s.tfm \
tex-ylyr8t.tfm \
tex-ylyr8t.vf \
tex-ylyri-t1.tfm \
tex-ylyri-ts1.tfm \
tex-ylyri8c.tfm \
tex-ylyri8c.vf \
tex-ylyri8s.tfm \
tex-ylyri8t.tfm \
tex-ylyri8t.vf \
tex-ylyriw8t.tfm \
tex-ylyriw8t.vf \
tex-ylyrw8t.tfm \
tex-ylyrw8t.vf \
texlive-libris"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-nfssext-cfr.sty \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-libris-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
