SUMMARY = "An easier interface to insert figures, tables and other objects in LaTeX"
DESCRIPTION = "In standard LaTeX inserting objects like figures or tables \
requires too much knowledge for beginners and too much typing \
effort and hardcoding for people like me. This package aims to \
make insertion of figures and tables easier for both beginners \
and experts. Despite the term floats in it's name it also \
allows to disable floating of such objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-2023.209.1.0.0svn57204-54.2.noarch.rpm"
RPM_HASH = "79a908f9182aec23f209bf11f5b79b3f211446d5f74b3cf1749dc1d7f567fa035336a3290febfa072a341533f6b175b54d7803a234771f3c9124bf78fa6e239f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easyfloats.sty \
texlive-easyfloats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-graphbox.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-pgfkeys.sty \
tex-subcaption.sty \
texlive \
texlive-caption \
texlive-environ \
texlive-etoolbox \
texlive-filesystem \
texlive-float \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
