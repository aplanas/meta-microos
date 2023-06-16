SUMMARY = "Create Handouts with notes from your LaTeX beamer presentation"
DESCRIPTION = "This package provides pgfpages layouts to place notes next to \
the scaled slides."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-2023.201.1.3svn62140-53.1.noarch.rpm"
RPM_HASH = "558edf8ceff4fb1980b7c156d1fdda5d8aa119164573a2bde7a55169971edc8612f345a39acf41b1681ba7a343af2bc97889e98eb82498be3744a671a1c3f8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handoutWithNotes.sty \
texlive-handoutwithnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-pgfpages.sty \
tex-translator.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
