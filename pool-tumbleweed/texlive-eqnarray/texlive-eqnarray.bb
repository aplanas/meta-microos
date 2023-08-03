SUMMARY = "More generalised equation arrays with numbering"
DESCRIPTION = "Defines an equationarray environment, that allows more than \
three columns, but otherwise behaves like LaTeX's eqnarray \
environment. This environment is similar, in some ways, to the \
align environment of amsmath. The package requires the array \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn20641"

RPM_NAME = "texlive-eqnarray-2023.209.1.3svn20641-54.1.noarch.rpm"
RPM_HASH = "c90c7f7b791abe24b94f49e3533b1b2f7d971357eba6941ca7a7c820e9fc26f3d448a8f74e1040ddc528e858caa274bd25af99152b6889e4d6169eb8573fef70"
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
