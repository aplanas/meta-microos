SUMMARY = "Redefine symbols where names conflict"
DESCRIPTION = "There are a number of symbols (e.g., \\Square) that are defined \
by several packages. In order to typeset all the variants in a \
document, we have to give the glyph a unique name. To do that, \
we define \\savesymbol{XXX}, which renames a symbol from \\XXX to \
\\origXXX, and \\restoresymbols{yyy}{XXX}, which renames \\origXXX \
back to \\XXX and defines a new command, \\yyyXXX, which \
corresponds to the most recently loaded version of \\XXX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn31565"

RPM_NAME = "texlive-savesym-2023.209.1.2svn31565-54.1.noarch.rpm"
RPM_HASH = "08bee190089509a5393e151fd46e52f427eac6cb21291011d1d99eddd97989a8434d45da284a7a74271c8853715b25ec67fe1a960f729585aea8c674aad829bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savesym.sty \
texlive-savesym"

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
