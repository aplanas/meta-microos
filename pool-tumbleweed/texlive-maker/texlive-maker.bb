SUMMARY = "Include Arduino or Processing code in LaTeX documents"
DESCRIPTION = "The first version of the package allows to include Arduino or \
Processing code using three different forms: writing the code \
directly in the LaTeX document writing Arduino or Processing \
commands in line with the text calling to Arduino or Processing \
files All these options support the syntax highlighting of the \
oficial IDE."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44823"

RPM_NAME = "texlive-maker-2023.201.1.0svn44823-52.1.noarch.rpm"
RPM_HASH = "318d9cfa3bda5a40c86bb4fe8fd980094d5e258d9f8fa73572692f4b247edf1d10bd3c9cfc39f97862393ac661f05e49657e3763c8f5f01293566f89233b60ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maker.sty \
texlive-maker"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
