SUMMARY = "More generalised equation arrays with numbering"
DESCRIPTION = "Defines an equationarray environment, that allows more than \
three columns, but otherwise behaves like LaTeX's eqnarray \
environment. This environment is similar, in some ways, to the \
align environment of amsmath. The package requires the array \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn20641"

RPM_NAME = "texlive-eqnarray-2023.201.1.3svn20641-53.1.noarch.rpm"
RPM_HASH = "f74ff0fa26be7f284bcc6a17eb618880d0e2f77843b3e1c01fc5cb0e940ce9cf465d42448079c617ba2b203a1714215c0fc1b0930c9f3d47fe101275beee1c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eqnarray.sty) \
texlive-eqnarray"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
