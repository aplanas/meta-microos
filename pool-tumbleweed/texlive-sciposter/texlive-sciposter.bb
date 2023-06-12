SUMMARY = "Make posters of ISO A3 size and larger"
DESCRIPTION = "This collection of files contains LaTeX packages for posters of \
ISO A3 size and larger (ISO A0 is the default size). American \
paper sizes and custom paper are supported. In particular, \
sciposter.cls defines a document class which allows cutting and \
pasting most of an article to a poster without any editing \
(save reducing the size) -- see the manual. Sciposter does work \
for LaTeX, not just pdfLaTeX. However, xdvi produces strange \
results, though a recent version of dvips does create good \
ps-files from the dvi files. Also note that logos must either \
be put in the current working directory or in the directories \
of your LaTeX distribution. For some reason graphicspath \
settings are ignored."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.18svn15878"

RPM_NAME = "texlive-sciposter-2023.201.1.18svn15878-53.1.noarch.rpm"
RPM_HASH = "f0cfdd462fcd2f42de201136f02a896985aae4aa2618d3664a35f1acae4e991bf7e4887a43e63e55116f2d6bcbbab2aa72c6d9b8a77175b8d0a74ae28ee9512c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(paperb0.cfg) \
tex(paperb1.cfg) \
tex(paperb2.cfg) \
tex(paperb3.cfg) \
tex(papercustom.cfg) \
tex(paperra0.cfg) \
tex(paperra1.cfg) \
tex(paperra2.cfg) \
tex(sciposter.cls) \
texlive-sciposter"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(a0size.sty) \
tex(article.cls) \
tex(boxedminipage.sty) \
tex(color.sty) \
tex(graphics.sty) \
tex(ifthen.sty) \
tex(lettrine.sty) \
tex(shadow.sty) \
tex(times.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
