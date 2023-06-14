SUMMARY = "PDF features across formats and engines"
DESCRIPTION = "Navigator implements PDF features for all formats (with some \
limitations in ConTeXt) with pdfTeX, LuaTeX and XeTeX (i.e. \
xdvipdfmx). Features include: Customizable outlines (i.e. \
bookmarks); Anchors; Links and actions (e.g. JavaScript or \
user-defined PDF actions); File embedding (not in ConTeXt); \
Document information and PDF viewer's display (not in ConTeXt); \
and Commands to create and use raw PDF objects. Navigator \
requires texapi and yax, both version at least 1.03."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn41413"

RPM_NAME = "texlive-navigator-2023.201.1.1svn41413-54.1.noarch.rpm"
RPM_HASH = "a2125e316a31e895e2d660d7265c8fa69275e3aacbf0d50cf759b61e226b0815fd1dacdd672b5bed7ec7bdcc1b218b9ca4e50bdcae00e3880866ed54237ba663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-navigator.sty \
tex-navigator.tex \
tex-t-navigator.tex \
texlive-navigator"

RDEPENDS:${PN} += "/bin/sh \
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
