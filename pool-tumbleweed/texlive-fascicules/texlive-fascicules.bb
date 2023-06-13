SUMMARY = "Create mathematical manuals for schools"
DESCRIPTION = "This package enables LaTeX users to create math books for \
middle and high schools. It provides commands to create the \
front page of the manual and the chapters. Each chapter can \
consist of three sections: the lesson, the exercises and the \
activities."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn54080"

RPM_NAME = "texlive-fascicules-2023.201.1svn54080-52.1.noarch.rpm"
RPM_HASH = "c46399932750063f18d9c5481c6d653e5f639eeea0142746d29c51f4a2420e53f16d7296e3e0150fed45e211cc0e92cd84fdcec24d73245ba99e349fa7a7c73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fascicules.sty) \
texlive-fascicules"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsthm.sty) \
tex(answers.sty) \
tex(beamerarticle.sty) \
tex(calc.sty) \
tex(cleveref.sty) \
tex(comment.sty) \
tex(enumitem.sty) \
tex(environ.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
tex(multicol.sty) \
tex(nameref.sty) \
tex(pgfopts.sty) \
tex(scrlayer-scrpage.sty) \
tex(tagging.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xcomment.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
