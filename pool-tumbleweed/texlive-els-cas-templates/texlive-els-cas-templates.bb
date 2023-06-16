SUMMARY = "Elsevier updated LaTeX templates"
DESCRIPTION = "This bundle provides two class and corresponding template files \
for typesetting journal articles supposed to go through \
Elsevier's updated workflow. One of the sets is meant for \
one-column, the other for two-column layout. These are now \
accepted for submitting articles both in Elsevier's electronic \
submission system and elsewhere."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn62931"

RPM_NAME = "texlive-els-cas-templates-2023.201.2.3svn62931-53.1.noarch.rpm"
RPM_HASH = "2c245eae6950b84ba65e344911ae251317939772ca4f7e343bcca453bd56c4af3e92cfdef5478c8dbb93fe5ff57e607259bdbb80c6c2e6ba292e5c57d4f21823"
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
