SUMMARY = "Write interactive web based quizzes"
DESCRIPTION = "WebQuiz makes it possible to use LaTeX to write interactive web \
based quizzes. The quizzes are first written in LaTeX and then \
converted into HTML files using WebQuiz, which is written in \
Python3. The conversion from LaTeX to HTML is done behind the \
scenes using TeX4ht."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.5.2svn58808"

RPM_NAME = "texlive-webquiz-2023.209.5.2svn58808-54.1.noarch.rpm"
RPM_HASH = "4713b9d9f02f99eff321a8ce3ff569672dad57b9b02b199d08b094496302fd5f9ba299f598a0cb77093a8394524cd74226ecd6de0a43e8e8ffe0119bea708ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-webquiz-doc.code.tex \
tex-webquiz-ini.code.tex \
tex-webquiz.cfg \
tex-webquiz.cls \
texlive-webquiz"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-article.cls \
tex-bbding.sty \
tex-etoolbox.sty \
tex-pgffor.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-webquiz-bin"

inherit rpm
