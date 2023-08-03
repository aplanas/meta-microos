SUMMARY = "LaTeX support for EBGaramond fonts in mathematics"
DESCRIPTION = "This package provides some LaTeX support for the use of \
EBGaramond12 in mathematics. It is based on, and requires, \
ebgaramond. The package was created in response to a question \
at TeX-stackexchange. and tested in the form of an answer in \
the same forum."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-2023.209.1.2svn52168-54.1.noarch.rpm"
RPM_HASH = "fc95d437f32c801a841526229a40a39ac1f09f66feb9f2840681cd44348b3666a3c8d151aac12f44fcc2ccf017b5ac138b072983f3007c6cdc755d9447388d98"
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
