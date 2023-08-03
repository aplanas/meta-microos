SUMMARY = "Running headers of the form 'Notes to pp.xx-yy'"
DESCRIPTION = "Endheads provides running headers of the form 'Notes to pp. \
xx-yy' for endnotes sections. It also enables one to reset the \
endnotes counter, and put a line marking the chapter change in \
the endnotes, at the beginning of every chapter. Endheads \
requires the fancyhdr, needspace, ifthen, and endnotes \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn43750"

RPM_NAME = "texlive-endheads-2023.209.1.6svn43750-54.1.noarch.rpm"
RPM_HASH = "b1601d0ee12cb84e56c95ee8063f3bd2d5cab023c8c696442821b694244b69bf00c7dccaa3d4a1d5b39dacb505db818363b6b684c7e8c3bf8c708d41054a8953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endheads.sty \
texlive-endheads"

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
