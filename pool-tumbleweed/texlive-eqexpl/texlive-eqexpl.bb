SUMMARY = "Align explanations for formulas"
DESCRIPTION = "This package was developed in response to a question on \
https://tex.stackexchange.com. Its purpose is to enable a \
perfectly formatted explanation of components of a formula. The \
package depends on calc, etoolbox, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-2023.201.1.1.1svn63629-53.1.noarch.rpm"
RPM_HASH = "5ab9da7da75296407ad8cb3336b08e7e1b98751f872ed73dc198de4e47445f58509a67e04b86db03d02165d0feded2f5493b675036cd99423bbfa3f157b09e98"
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
