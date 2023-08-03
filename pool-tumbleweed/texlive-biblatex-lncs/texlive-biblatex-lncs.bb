SUMMARY = "BibLaTeX style for Springer Lecture Notes in Computer Science"
DESCRIPTION = "This is a BibLaTeX style for Springer Lecture Notes in Computer \
Science (LNCS). It extends the standard BiBTeX model by an \
acronym entry."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn65280"

RPM_NAME = "texlive-biblatex-lncs-2023.209.0.0.6svn65280-54.1.noarch.rpm"
RPM_HASH = "3803a79bfd3424f0903854b89f2eb3b337023258448427b405d386f2d0705caa765afbea7b91b234dc8261f32b884eff8eb88d918bd9ebd0b7e3221200c3a082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lncs.bbx \
tex-lncs.cbx \
texlive-biblatex-lncs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.bbx \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
