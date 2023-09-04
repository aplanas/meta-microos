SUMMARY = "Align explanations for formulas"
DESCRIPTION = "This package was developed in response to a question on \
https://tex.stackexchange.com. Its purpose is to enable a \
perfectly formatted explanation of components of a formula. The \
package depends on calc, etoolbox, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-2023.209.1.1.1svn63629-54.2.noarch.rpm"
RPM_HASH = "579a5e2509149b20ceba4ee415bb851051de69eaf23f77ca3ff2e8317c826906c3963f72d3d461a22075d5b460ae8bc385545886a43b47607c1d6ec15661b136"
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
