SUMMARY = "LaTeX support for EBGaramond fonts in mathematics"
DESCRIPTION = "This package provides some LaTeX support for the use of \
EBGaramond12 in mathematics. It is based on, and requires, \
ebgaramond. The package was created in response to a question \
at TeX-stackexchange. and tested in the form of an answer in \
the same forum."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-2023.201.1.2svn52168-53.2.noarch.rpm"
RPM_HASH = "0e8576b9f26c3d35d90a2618b18d7fc576a9171e6564a1364882ef5617fd03c3ccaddf524b4e00ccd9e6a1ee4a6b48a6f6bf07af3ce8ed4498537202f6fa8eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-EBGaramond-Italic--oml-ebgaramond.tfm \
tex-EBGaramond-Maths.map \
tex-OMLEBGaramond-Maths.fd \
tex-a-w5zv5t.enc \
tex-ebgaramond-maths.sty \
texlive-ebgaramond-maths"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ebgaramond.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
