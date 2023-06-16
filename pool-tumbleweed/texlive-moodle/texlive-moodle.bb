SUMMARY = "Generating Moodle quizzes via LaTeX"
DESCRIPTION = "A package for writing Moodle quizzes in LaTeX. In addition to \
typesetting the quizzes for proofreading, the package compiles \
an XML file to be uploaded to a Moodle server."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65672"

RPM_NAME = "texlive-moodle-2023.201.1.0svn65672-54.1.noarch.rpm"
RPM_HASH = "6ac76169f82b5d3da008e674c9e668ad76c5ed3f32c6bb636c0f1ef3c2c1aef51e1a1aec62912e334156be9704eb8b9ce97d10b3f372cea11b292cebb10b1a2f"
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
