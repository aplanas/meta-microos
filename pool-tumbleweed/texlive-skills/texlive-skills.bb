SUMMARY = "Create proficiency tests"
DESCRIPTION = "This package attempts to make it easy for even a LaTeX novice \
to prepare proficiency tests, especially in combination with \
the exam document class. Thus, almost all command names are \
very similar. After defining skills in the preamble or in an \
external file, they are declared using labels, and can \
optionally be set as global skills. A skills table is generated \
to summarize the evaluated competencies and to allow for \
writing down the resulting proficiency level. A user's guide \
attempts to explain all of the possibilities in a readable way, \
with many examples."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn56734"

RPM_NAME = "texlive-skills-2023.209.1.0.0svn56734-58.1.noarch.rpm"
RPM_HASH = "22255678c1a6aa043aef576bb990c0d6e260c8403b587d86b3064428700579ba40bac646f68568ddf8eced205ad33f04d6611575c54db48344f6443fdaed332e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skills.sty \
texlive-skills"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-glossaries.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
