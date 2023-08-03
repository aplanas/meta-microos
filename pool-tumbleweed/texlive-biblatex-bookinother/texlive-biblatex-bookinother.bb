SUMMARY = "Manage book edited in other entry type"
DESCRIPTION = "This package provides new BibLaTeX entry types and fields for \
book edited in other types, like for instance @bookinarticle. \
It offers more types than the older package \
biblatex-bookinarticle which it superseeds."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.3svn54015"

RPM_NAME = "texlive-biblatex-bookinother-2023.209.2.3.3svn54015-54.1.noarch.rpm"
RPM_HASH = "5815f3c810a48b60b4a17aedc99afe6691634b4be58eb158fc9e1d6c115015082140d5bb26355cdaf411cf04ed255a0ec27d9d5c8c410478c1e8419479ad06bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookinother.bbx \
texlive-biblatex-bookinother"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
