SUMMARY = "Permit footnotes in tables"
DESCRIPTION = "The package provides the command \\tablefootnote to be used in a \
table or sidewaystable environment, where \\footnote will not \
work (and when using \\footnotemark and \\footnotetext, and \
adjusting the counter as necessary, is too much work)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1csvn32804"

RPM_NAME = "texlive-tablefootnote-2023.209.1.1csvn32804-58.1.noarch.rpm"
RPM_HASH = "b7922684cc54291882a7bb61556cc62ed1cdaef944c024ae2efa17df2da641579e25f7021979b4ebcfaa7b4122411535bd417e83a59bc9bd3c52f08852e76ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablefootnote.sty \
texlive-tablefootnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
