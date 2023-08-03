SUMMARY = "Template for YB Branded Books"
DESCRIPTION = "This template helps the author design books published on Amazon \
under the 'Y.B.' brand. You are welcome to use it too for your \
own books."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-2023.209.0.0.2.0svn64586-53.1.noarch.rpm"
RPM_HASH = "e738bef2db19a66e623baacf7d89497305e52b5b5b53fb385ada94344e8cbd62ebbbec372db96df192b4631b6c2dd9f3c333a841cfe299b05c7b91395d4ab786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yb-book.cls \
texlive-yb-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-book.cls \
tex-changepage.sty \
tex-chngcntr.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-imakeidx.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-libertine.sty \
tex-lmodern.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-paralist.sty \
tex-perpage.sty \
tex-setspace.sty \
tex-soul.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-ulem.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-anyfontsize \
texlive-biblatex \
texlive-bigfoot \
texlive-changepage \
texlive-chngcntr \
texlive-csquotes \
texlive-enumitem \
texlive-fancyhdr \
texlive-filesystem \
texlive-float \
texlive-footmisc \
texlive-geometry \
texlive-ifmtarg \
texlive-imakeidx \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-libertine \
texlive-mdframed \
texlive-microtype \
texlive-needspace \
texlive-paralist \
texlive-pgf \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-setspace \
texlive-soul \
texlive-titlesec \
texlive-ulem \
texlive-wrapfig \
texlive-xcolor \
texlive-xifthen \
texlive-xkeyval \
texlive-zref"

inherit rpm
