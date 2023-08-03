SUMMARY = "German hyphenation patterns for traditional orthography"
DESCRIPTION = "The package provides older hyphenation patterns for the German \
language. Please note that by default only pdfLaTeX uses these \
patterns (mainly for backwards compatibility). The older \
packages ghyphen and gnhyph are now bundled together with \
dehyph, and are no longer be updated. Both XeLaTeX and LuaLaTeX \
use the current German hyphenation patterns taken from \
Hyphenation patterns in UTF-8, and using the Experimental \
hyphenation patterns for the German language package it is \
possible to make pdfLaTeX use the new German patterns as well."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48599"

RPM_NAME = "texlive-dehyph-2023.209.svn48599-53.1.noarch.rpm"
RPM_HASH = "4ce92d53e2653317ebb8174b637cc412c8463c2014f1edae82d33ef00025255fc0a2fa26ca1caecde0046af674b76500270a54ad0ea250029ab338bf0e45ef09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dehyphn.tex \
tex-dehypht.tex \
tex-dehyphtex.tex \
texlive-dehyph"

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
