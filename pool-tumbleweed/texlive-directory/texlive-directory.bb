SUMMARY = "An address book using BibTeX"
DESCRIPTION = "A package for LaTeX and BibTeX that facilitates the \
construction, maintenance and exploitation of an address \
book-like database."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn15878"

RPM_NAME = "texlive-directory-2023.209.1.20svn15878-53.1.noarch.rpm"
RPM_HASH = "0ad6c11ca630ce812cee41cf0617f8af76503bb2a945492d06b2b33bb179a484ba79fc0cb5023ea8b6b14e8c47b1edfe6799d2610b306c0d37360a04a52986cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-directory.sty \
texlive-directory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
