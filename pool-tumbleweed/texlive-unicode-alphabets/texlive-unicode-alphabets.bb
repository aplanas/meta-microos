SUMMARY = "Macros for using characters from Unicode's Private Use Area"
DESCRIPTION = "While Unicode supports the vast majority of use cases, there \
are certain specialized niches which require characters and \
glyphs not (yet) represented in the standard. Thus the Private \
Use Area (PUA) at code points E000-F8FF, which enables third \
parties to define arbitrary character sets. This package allows \
configuring a number of macros for using various PUA character \
sets in LaTeX (AGL, CYFI, MUFI, SIL, TITUS, UCSUR, UNZ), to \
enable transcription and display of medieval and other \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66225"

RPM_NAME = "texlive-unicode-alphabets-2023.209.svn66225-54.1.noarch.rpm"
RPM_HASH = "e8150caa5d4a07e7a26a15ed663422a9479aff9586df19a27e67270909e0330b4d76aaaab829cc9e6d301be83b7e49523814dae0d974738f5775c3ea0547ef9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-alphabets.sty \
texlive-unicode-alphabets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csvsimple.sty \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-stringstrings.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
