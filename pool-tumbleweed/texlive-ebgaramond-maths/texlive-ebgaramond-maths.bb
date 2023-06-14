SUMMARY = "LaTeX support for EBGaramond fonts in mathematics"
DESCRIPTION = "This package provides some LaTeX support for the use of \
EBGaramond12 in mathematics. It is based on, and requires, \
ebgaramond. The package was created in response to a question \
at TeX-stackexchange. and tested in the form of an answer in \
the same forum."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-2023.201.1.2svn52168-53.1.noarch.rpm"
RPM_HASH = "aa112d3e530c1ac3d33d219db815585c82e17c9c9edada5f6eaa0ec19c2ee365ab2137a7bfc409d38813ed8331a7955fa402f4995e584af7d1b51701a1a4861b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-EBGaramond-Italic--oml-ebgaramond.tfm \
tex-EBGaramond-Maths.map \
tex-OMLEBGaramond-Maths.fd \
tex-a-w5zv5t.enc \
tex-ebgaramond-maths.sty \
texlive-ebgaramond-maths"

RDEPENDS:${PN} += "/bin/sh \
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
