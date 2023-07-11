SUMMARY = "Align explanations for formulas"
DESCRIPTION = "This package was developed in response to a question on \
https://tex.stackexchange.com. Its purpose is to enable a \
perfectly formatted explanation of components of a formula. The \
package depends on calc, etoolbox, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-2023.201.1.1.1svn63629-53.2.noarch.rpm"
RPM_HASH = "30165b244f799cfc8de63159c1bef9cefbeca14ed6b1b6e7193dbc5a92c5ee13c6f53c1b0ad86196978758d07d26fa2125b496f3fc88c2ea1e2729ef41c0bc57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqexpl.sty \
texlive-eqexpl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
