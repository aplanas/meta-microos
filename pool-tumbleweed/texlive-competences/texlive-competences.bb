SUMMARY = "Track skills of classroom checks"
DESCRIPTION = "This package is an attempt to track skills assessed during a \
classroom check. Each question can be associated with one or \
more skills and be assigned a number of points to be earned. At \
the end of the text, a table set summarizes the skills \
assessed, and in what proportions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47573"

RPM_NAME = "texlive-competences-2023.209.1.0svn47573-54.1.noarch.rpm"
RPM_HASH = "a694ff85ebe4c5d06415b18212eb1585eebfef7705f83bc0c32d4f2ae2da10cbf8b0a4814b4a7c8154f0710f120e9c551949229b07e8cc71cdf7a4a14cb78e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-competences.sty \
texlive-competences"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-etoolbox.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
