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

PV = "2023.209.1.1svn41413"

RPM_NAME = "texlive-navigator-2023.209.1.1svn41413-55.1.noarch.rpm"
RPM_HASH = "e5e9161a5b9e2bbd52fac957ae150dc73b00146ca1d9c3ef5c9aca174ca4ebc19d1c17ce005cf52fd9b5970048d0c278e3f1a60a84eece19740d137a4f5b1085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-navigator.sty \
tex-navigator.tex \
tex-t-navigator.tex \
texlive-navigator"

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
