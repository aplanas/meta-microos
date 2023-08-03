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

PV = "2023.209.0.0.6svn53052"

RPM_NAME = "texlive-accsupp-2023.209.0.0.6svn53052-55.1.noarch.rpm"
RPM_HASH = "7a71dc8088d0bb4b965a1403300f13153adfe6e15765fedec616cc1eff6ab51c35da9f2dbafe8d25e7b87d5be264bd5195a2245b4dad09e08c532534d873460c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accsupp-dvipdfm.def \
tex-accsupp-dvips.def \
tex-accsupp-luatex.def \
tex-accsupp-pdftex.def \
tex-accsupp.sty \
texlive-accsupp"

RDEPENDS:${PN} += "/usr/bin/sh \
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
