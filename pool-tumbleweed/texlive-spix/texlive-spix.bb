SUMMARY = "Yet another TeX compilation tool: simple, human readable, no option, no magic"
DESCRIPTION = "SpiX offers a way to store information about the compilation \
process for a tex file inside the tex file itself. Just write \
the commands as comments in the tex files, and SpiX will \
extract and run those commands. Everything is stored in the tex \
file (so that you are not missing some piece of information \
that is located somewhere else), in a human-readable format (no \
need to know SpiX to understand it)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.0svn65050"

RPM_NAME = "texlive-spix-2023.201.1.3.0svn65050-57.1.noarch.rpm"
RPM_HASH = "ca0874edf9574b108092487ac1dc51067b93c0e6b7fa9aacfb56c3796393ad5051e97da576169e6741aafd722a1768f25169c7337d43eb7f81eb0eb09c5442c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spix"

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
texlive-spix-bin"

inherit rpm
