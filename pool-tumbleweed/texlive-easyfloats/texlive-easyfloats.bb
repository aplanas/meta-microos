SUMMARY = "An easier interface to insert figures, tables and other objects in LaTeX"
DESCRIPTION = "In standard LaTeX inserting objects like figures or tables \
requires too much knowledge for beginners and too much typing \
effort and hardcoding for people like me. This package aims to \
make insertion of figures and tables easier for both beginners \
and experts. Despite the term floats in it's name it also \
allows to disable floating of such objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-2023.201.1.0.0svn57204-53.1.noarch.rpm"
RPM_HASH = "60097bb8a1e32bb52a8331897ea33afaa28c067df28cfe534a870519ae56b18e7854de60a0f8a578f27b5c4860a4cf2bc3259d58e2f50f4ef442c5f8b022c7b5"
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
