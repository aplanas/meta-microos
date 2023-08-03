SUMMARY = "Include whole or partial Jupyter notebooks in LaTeX documents"
DESCRIPTION = "This package provides a python3 script and a LaTeX .sty file \
which can be used together to include Jupyter Notebooks (all of \
them, or some specific cells) as part of a LaTeX document. It \
will convert the Jupyter Notebook format to proper LaTeX so it \
gets included seamlessly, supporting text, LaTeX, images, etc."
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.1svn56715"

RPM_NAME = "texlive-jupynotex-2023.209.0.0.1svn56715-56.1.noarch.rpm"
RPM_HASH = "c090bc425bb4828cf42ef77fa56caea187181c53d573b076de9345c01e63a5b298bc1f9f1dd6597f3c5cb62a4ed32f2c5a10c4f539db468201e56d07748f7397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jupynotex.sty \
texlive-jupynotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
