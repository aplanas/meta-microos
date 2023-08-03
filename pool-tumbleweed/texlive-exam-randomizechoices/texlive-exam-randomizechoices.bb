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

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-exam-randomizechoices-2023.209.0.0.2svn61719-53.1.noarch.rpm"
RPM_HASH = "0d1ee58451a3b5de7d4ca380a0c3e04c2ff40a45dfb80ec1689822078bae0398c146cccc63174e085c0354c5e191da3bfb3c4ef3810e42bff2e4468e41f7e8a7"
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
