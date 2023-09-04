SUMMARY = "Embed Python code in LaTeX"
DESCRIPTION = "The package enables you to embed Python code in LaTeX, and \
insert the script's output in the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.22svn60162"

RPM_NAME = "texlive-python-2023.209.0.0.22svn60162-54.2.noarch.rpm"
RPM_HASH = "fce71844ab64c850c1b3a3115f4e3669a739d31bedc373c6be64e4bf50b3dac154b79bda5f59ba407d53dcb80dc82891fdf2c9e062bdd88b0da947ce1bd6bd88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-python.sty \
texlive-python"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
