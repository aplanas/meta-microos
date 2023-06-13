SUMMARY = "Generate problem sheets and their solution sheets"
DESCRIPTION = "The package is designed for lecturers who have to generate new \
problem sheets for their students on a regular basis (e.g. \
yearly) by randomly selecting a specified number of problems \
defined in another file. The package allows you easily to \
generate a new problem sheet that is different from the \
previous year, thus alleviating the temptation of students to \
seek out the previous year's students and checking out their \
answers. The solutions to the problems can be defined along \
with the problem, making it easy to generate the solution sheet \
from the same source code; problems may be reused within a \
document, so that solutions may appear in a different section \
of the same document as the problems they cover."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.05svn44783"

RPM_NAME = "texlive-probsoln-2023.201.3.05svn44783-52.1.noarch.rpm"
RPM_HASH = "a953e25a0e3ac711c1e7885822a82dc83a6f90a187e517d8f62e68e5974f82d1437db368e73bb1b09caf10c551e928a90e1275f4ddf6b471737dd87fff08dbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(probsoln.sty) \
texlive-probsoln"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
