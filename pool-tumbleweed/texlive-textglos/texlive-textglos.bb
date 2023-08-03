SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The package provides a set of macros for in-line linguistic \
examples (as opposed to interlinear glossing, set apart from \
the main text). It prevents hyphenated examples from breaking \
across lines and consistently formats phonemic examples, \
orthographic examples, and more."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30788"

RPM_NAME = "texlive-textglos-2023.209.1.0svn30788-55.1.noarch.rpm"
RPM_HASH = "0ef5500a72442dfc322cb635e4942b37ebecde8f007834f20c8aa16d37f10f2421f195665e20b55b027ee44eb15c12b54f14505fd002d713e65e3567141d963f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textglos.sty \
texlive-textglos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
