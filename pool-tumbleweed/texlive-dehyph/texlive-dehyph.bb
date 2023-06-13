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

PV = "2023.201.svn48599"

RPM_NAME = "texlive-dehyph-2023.201.svn48599-52.1.noarch.rpm"
RPM_HASH = "841512dc51a8de56cfe877296cc69b29def1abba136ea0e3627f1c24a2d231e2c442de8c5622c75b4aba1389464a5beec8c40e18b7defc9b1d4e53761f1c31d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dehyphn.tex) \
tex(dehypht.tex) \
tex(dehyphtex.tex) \
texlive-dehyph"

RDEPENDS:${PN} += "/bin/sh \
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
