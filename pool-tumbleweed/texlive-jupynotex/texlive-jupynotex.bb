SUMMARY = "Include whole or partial Jupyter notebooks in LaTeX documents"
DESCRIPTION = "This package provides a python3 script and a LaTeX .sty file \
which can be used together to include Jupyter Notebooks (all of \
them, or some specific cells) as part of a LaTeX document. It \
will convert the Jupyter Notebook format to proper LaTeX so it \
gets included seamlessly, supporting text, LaTeX, images, etc."
LICENSE = "Apache-1.0"

PV = "2023.201.0.0.1svn56715"

RPM_NAME = "texlive-jupynotex-2023.201.0.0.1svn56715-55.1.noarch.rpm"
RPM_HASH = "d3c879ca6ee8229d825a6e6714401d2bb634fd0e910da463e7cec8ab773c68185b1669c13460f6c3c2d0df5f7e5a409fd075d5c78224a5581d2b33d21e97ae66"
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
