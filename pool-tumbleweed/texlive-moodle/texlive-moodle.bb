SUMMARY = "Generating Moodle quizzes via LaTeX"
DESCRIPTION = "A package for writing Moodle quizzes in LaTeX. In addition to \
typesetting the quizzes for proofreading, the package compiles \
an XML file to be uploaded to a Moodle server."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65672"

RPM_NAME = "texlive-moodle-2023.209.1.0svn65672-55.1.noarch.rpm"
RPM_HASH = "75bebd761eba40b6cceb2fc9b74f5d1519847fdf51c703000492d37de5fbfc71a723c29647a5177762c170e1c8ed4636292a787b1a13d6292c56c2bd92b90ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moodle.sty \
texlive-moodle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-environ.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-getitems.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-randomlist.sty \
tex-readprov.sty \
tex-shellesc.sty \
tex-tikz.sty \
tex-translator.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
