SUMMARY = "An easier interface to insert figures, tables and other objects in LaTeX"
DESCRIPTION = "In standard LaTeX inserting objects like figures or tables \
requires too much knowledge for beginners and too much typing \
effort and hardcoding for people like me. This package aims to \
make insertion of figures and tables easier for both beginners \
and experts. Despite the term floats in it's name it also \
allows to disable floating of such objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-2023.201.1.0.0svn57204-53.2.noarch.rpm"
RPM_HASH = "1e920b3f97375b40881edbad807919206021e7f8b48a7af975e2ec7992bdeb0a9ccc61b993b5ec2361018e0af279adda8f2f365631b77ca6531dfe1ce33d99dd"
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
