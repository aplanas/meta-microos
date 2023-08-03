SUMMARY = "Creating crossword grids, using TikZ"
DESCRIPTION = "The package produces crossword grids, using a wide variety of \
colours and decorations of the grids and the text in them. The \
package uses TikZ for its graphical output."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn32313"

RPM_NAME = "texlive-pas-crosswords-2023.209.1.03svn32313-52.1.noarch.rpm"
RPM_HASH = "d1719669b0cdaae6944b490baa4a6c84bd90e761769ba0eb4f48dfb136fdb9cee8465d5f0be413ff7abaa7cedc0e8993578c7f0700964b544b9eef2d6727ca4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pas-crosswords.sty \
texlive-pas-crosswords"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-multido.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
