SUMMARY = "Move floats to the end, leaving markers where they belong"
DESCRIPTION = "Place all floats on pages by themselves at the end of the \
document, optionally leaving markers like '[Figure 3 about \
here]' in the text near to where the figure (or table) would \
normally have occurred. Float types figure and table are \
recognised by the package, unmodified. Since several packages \
define other types of float, it is possible to register these \
float types with endfloat."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.7svn57090"

RPM_NAME = "texlive-endfloat-2023.209.2.7svn57090-54.2.noarch.rpm"
RPM_HASH = "4b3fc0a84606b0f6700eec2cb8c08905cfc70e60f1e3fed83a2a23821c3cf805e85c72fc9d7edb8e54f5b66a24422fbc4c3aa0b4656cc6f5a1fb44fcc107d3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endfloat.sty \
texlive-endfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
