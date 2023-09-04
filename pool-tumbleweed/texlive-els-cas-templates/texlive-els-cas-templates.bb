SUMMARY = "Elsevier updated LaTeX templates"
DESCRIPTION = "This bundle provides two class and corresponding template files \
for typesetting journal articles supposed to go through \
Elsevier's updated workflow. One of the sets is meant for \
one-column, the other for two-column layout. These are now \
accepted for submitting articles both in Elsevier's electronic \
submission system and elsewhere."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-2023.209.2.3svn62931-54.2.noarch.rpm"
RPM_HASH = "8e7745e829c315248c7a97f71ebdd10b17c247683420e2700e0311495ae42fd1f9691639e2391b32ddb9a5532093fdf67f5e17d927b67fb91fb9c3c1d5973ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cas-common.sty \
tex-cas-dc.cls \
tex-cas-sc.cls \
texlive-els-cas-templates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-balance.sty \
tex-booktabs.sty \
tex-colortbl.sty \
tex-dcolumn.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inconsolata.sty \
tex-makecell.sty \
tex-moreverb.sty \
tex-multirow.sty \
tex-setspace.sty \
tex-stfloats.sty \
tex-stix.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
