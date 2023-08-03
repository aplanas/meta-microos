SUMMARY = "Align explanations for formulas"
DESCRIPTION = "This package was developed in response to a question on \
https://tex.stackexchange.com. Its purpose is to enable a \
perfectly formatted explanation of components of a formula. The \
package depends on calc, etoolbox, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-2023.209.1.1.1svn63629-54.1.noarch.rpm"
RPM_HASH = "88e2c07e6ee118f37262752badc2119ff6b79102d883b64ff7b033ffa583e3c53b1a9a4807c40354d3cffc6d9b8698de2a36d9ae2eca8b83d60e38fc63274e9f"
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
