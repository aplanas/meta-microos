SUMMARY = "Unofficial class for the new version of the Europass curriculum vitae"
DESCRIPTION = "This class is an unofficial LaTeX implementation of the \
Europass CV, the standard model for curriculum vitae as \
recommended by the European Commission. It includes the major \
style updates that came out in 2013, featuring a neater, more \
compact and somewhat fancier layout."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56829"

RPM_NAME = "texlive-europasscv-2023.209.svn56829-53.1.noarch.rpm"
RPM_HASH = "a6d00395996f2b079d8677d923bf539d8d25f2fe98c8409c8b95487b036e724ed81b87f59db7058bcbb9c4fa43838ef28f3b6382f1eb37d9fa6a22d520fd307b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-europasscv-bibliography.sty \
tex-europasscv-ca.def \
tex-europasscv-cs.def \
tex-europasscv-da.def \
tex-europasscv-de.def \
tex-europasscv-el.def \
tex-europasscv-en.def \
tex-europasscv-es.def \
tex-europasscv-fr.def \
tex-europasscv-hu.def \
tex-europasscv-it.def \
tex-europasscv-nb.def \
tex-europasscv-pl.def \
tex-europasscv-pt.def \
tex-europasscv-ro.def \
tex-europasscv-sk.def \
tex-europasscv-sl.def \
tex-europasscv-sv.def \
tex-europasscv-tr.def \
tex-europasscv.cls \
texlive-europasscv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-biblatex-ext-tabular.sty \
tex-colortbl.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-setspace.sty \
tex-showframe.sty \
tex-soul.sty \
tex-substr.sty \
tex-textcomp.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
