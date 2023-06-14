SUMMARY = "Better accessibility support for PDF files"
DESCRIPTION = "Since PDF 1.5 portions of a page can be marked for better \
accessibility support. For example, replacement texts or \
expansions of abbreviations can be provided. This package \
starts with providing a minimal low-level interface for \
programmers; its status is experimental. Support necessary for \
the package was added to the 'distill' capabilities of \
Ghostscript with version 9.15 of Ghostscript; the dvips is only \
available with that version (or later)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-2023.201.0.0.6svn53052-54.1.noarch.rpm"
RPM_HASH = "7039269c92ee4b79b65cdb3f02812ec7484f58b1f808339d0f6cfc4d2d6c4c556cef98b71e4c86a5250581084aab092a0bceea28373f40b5a9972e899f869fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accsupp-dvipdfm.def \
tex-accsupp-dvips.def \
tex-accsupp-luatex.def \
tex-accsupp-pdftex.def \
tex-accsupp.sty \
texlive-accsupp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-kvoptions.sty \
tex-pdfescape.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
