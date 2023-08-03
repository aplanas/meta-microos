SUMMARY = "On-the-fly download of missing TeX live packages"
DESCRIPTION = "The package provides a script that performs 'on the fly' \
downloads of missing packages, while a document is being \
compiled. (This feature is already available in the MikTeX \
distribution for Windows machines.) To use the script, replace \
your (LaTeX) compilation command with texliveonfly.py file.tex \
(default options are --engine=pdflatex and \
--arguments='-synctex=1 -interaction=nonstopmode', which may \
all be changed). The script is designed to work on Linux \
distributions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn55777"

RPM_NAME = "texlive-texliveonfly-2023.209.svn55777-55.1.noarch.rpm"
RPM_HASH = "fbc77ba8fc834c77859160bf91127564622da852a836766c3b0d9a719a8bf565f6d447041c7b877b1654a54d20c4800daa9bbe69baa4e7ea92a601a18f2c2e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
texlive-scripts-bin \
texlive-texliveonfly-bin"

inherit rpm
