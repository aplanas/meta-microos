SUMMARY = "An easier interface to insert figures, tables and other objects in LaTeX"
DESCRIPTION = "In standard LaTeX inserting objects like figures or tables \
requires too much knowledge for beginners and too much typing \
effort and hardcoding for people like me. This package aims to \
make insertion of figures and tables easier for both beginners \
and experts. Despite the term floats in it's name it also \
allows to disable floating of such objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-2023.209.1.0.0svn57204-54.1.noarch.rpm"
RPM_HASH = "a7742a12688f7227e87034cdd76f37b8fe5b15be2f0d8815c4a7f8257b4488e9a02d9aefed4c81c8a644c3244027bfc08c87677e5cfb9442dc5c1d6694f5a5d5"
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
