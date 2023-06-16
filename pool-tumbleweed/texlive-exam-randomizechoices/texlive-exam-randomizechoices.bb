SUMMARY = "Randomize mc choices using the exam class"
DESCRIPTION = "This package is an extension to the exam document class. It \
provides the user with four new multiple choice typesetting \
environments which place their content in a random order. It \
can (only) be used in combination with the exam class. It can \
only randomize the placement of choices in multiple choice \
questions. The questions themselves cannot be randomized with \
this package. Furthermore, the package provides a simple answer \
key table typesetter and has a command for writing the answer \
keys to an external file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-2023.201.0.0.2svn61719-52.1.noarch.rpm"
RPM_HASH = "b243ed58ebcb7d4883b1e012733f559e99e5c537de2fef05c5aedff171e11af342c4be31301bddb2426475f90ee4b1903a5c83c6ed5273b7c782024c3743bac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-randomizechoices.sty \
texlive-exam-randomizechoices"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
