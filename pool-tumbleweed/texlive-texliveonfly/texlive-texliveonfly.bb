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

PV = "2023.201.svn55777"

RPM_NAME = "texlive-texliveonfly-2023.201.svn55777-54.1.noarch.rpm"
RPM_HASH = "b08952ce780b941a718670ebf99cf7546f4513e1098b30f8b6417f5ba1701d7f83d3b663d64afca67e496a705bfc13b4df5469c645acbf1493947d8e95004c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
