SUMMARY = "Write interactive web based quizzes"
DESCRIPTION = "WebQuiz makes it possible to use LaTeX to write interactive web \
based quizzes. The quizzes are first written in LaTeX and then \
converted into HTML files using WebQuiz, which is written in \
Python3. The conversion from LaTeX to HTML is done behind the \
scenes using TeX4ht."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.5.2svn58808"

RPM_NAME = "texlive-webquiz-2023.201.5.2svn58808-53.1.noarch.rpm"
RPM_HASH = "e4fc4f1ca574fc1a514f6faf93bb20dec0972277e69a03f95e1e6ee0a39506c88178d0567439c14dd8eabcd8e5468f40f511fc4770abb008153d71adb6a9d921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(webquiz-doc.code.tex) \
tex(webquiz-ini.code.tex) \
tex(webquiz.cfg) \
tex(webquiz.cls) \
texlive-webquiz"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(article.cls) \
tex(bbding.sty) \
tex(etoolbox.sty) \
tex(pgffor.sty) \
tex(pgfopts.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-webquiz-bin"

inherit rpm
