SUMMARY = "LaTeX support for EBGaramond fonts in mathematics"
DESCRIPTION = "This package provides some LaTeX support for the use of \
EBGaramond12 in mathematics. It is based on, and requires, \
ebgaramond. The package was created in response to a question \
at TeX-stackexchange. and tested in the form of an answer in \
the same forum."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-2023.209.1.2svn52168-54.2.noarch.rpm"
RPM_HASH = "cca2477747ea9fb7e61ad7a42c410020e60447b0c8664b61bbfc5551c0d7a21fb0666016ffa7a8f88209a0ad7337d74c77cfc13c1fd4d8da23a89210bd709ac1"
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
