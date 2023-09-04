SUMMARY = "More generalised equation arrays with numbering"
DESCRIPTION = "Defines an equationarray environment, that allows more than \
three columns, but otherwise behaves like LaTeX's eqnarray \
environment. This environment is similar, in some ways, to the \
align environment of amsmath. The package requires the array \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn20641"

RPM_NAME = "texlive-eqnarray-2023.209.1.3svn20641-54.2.noarch.rpm"
RPM_HASH = "912a2eb2fb571ffeaebe758478c31f845094a530b981e4d9a4017cdff7a7b748f1307c700d518b53bd323719c9dae4ac6363b3cba65fb87b2a784568987939c8"
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
