SUMMARY = "Colorful edits for multiple authors of a shared document"
DESCRIPTION = "This package provides a fairly light-weight solution for \
annotating LaTeX source code with color to show \
additions/changes, replacements, deletions, and comments. This \
is particularly useful when a document is being edited by \
multiple authors. Two package options allow the quick \
suppression of all colorful edits and comments, and showing \
text whose deletion was proposed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56707"

RPM_NAME = "texlive-color-edits-2023.209.1.1svn56707-54.1.noarch.rpm"
RPM_HASH = "1eb5a39318bb0ca994070c29266ad924bd7aa0f0f641c9fa25adcacafb787a1258480f294aec56ae8a95b857e277f26a85f4827752a030f03f92b703d6c2f39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color-edits.sty \
texlive-color-edits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
