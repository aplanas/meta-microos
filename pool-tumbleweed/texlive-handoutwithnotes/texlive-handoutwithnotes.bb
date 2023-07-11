SUMMARY = "Create Handouts with notes from your LaTeX beamer presentation"
DESCRIPTION = "This package provides pgfpages layouts to place notes next to \
the scaled slides."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-2023.201.1.3svn62140-53.2.noarch.rpm"
RPM_HASH = "1f4b2ba6f2a5e4c42b694df99f475eb72b80d35f846fb10b5df144f096034887a9d22b896c10afa6a376e0cb428c447e9b658a5cc195afaa5ceadc715d7a8c81"
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
