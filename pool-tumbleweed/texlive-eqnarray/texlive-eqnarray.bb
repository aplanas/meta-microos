SUMMARY = "More generalised equation arrays with numbering"
DESCRIPTION = "Defines an equationarray environment, that allows more than \
three columns, but otherwise behaves like LaTeX's eqnarray \
environment. This environment is similar, in some ways, to the \
align environment of amsmath. The package requires the array \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn20641"

RPM_NAME = "texlive-eqnarray-2023.201.1.3svn20641-53.2.noarch.rpm"
RPM_HASH = "0abc1a6db7301f8209481e0a0848b812d3b4f51d845f30651ec0119f34feeccea73a7b94365f1373481c228d52d4647432b93fb4a858a3f7bd3e95ab681baac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqnarray.sty \
texlive-eqnarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
