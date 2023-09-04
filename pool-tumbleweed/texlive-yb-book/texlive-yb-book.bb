SUMMARY = "Template for YB Branded Books"
DESCRIPTION = "This template helps the author design books published on Amazon \
under the 'Y.B.' brand. You are welcome to use it too for your \
own books."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-2023.209.0.0.2.0svn64586-53.2.noarch.rpm"
RPM_HASH = "70396138d42c74eb44832690a57d58b7e35b683339219d928c6674289e0e1b9cc8e2d6f48d153f1c4151487d9aab0c3ffa34d20b7d7e103a1490b5d1c2ef7f0f"
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
