SUMMARY = "Dummy text for testing index styles and indexing applications"
DESCRIPTION = "This is a LaTeX package that provides a command to produce \
dummy text interspersed with \\index commands to test an index \
style or indexing application. The dummy text is mostly in \
English, but includes extended Latin characters provided either \
through LaTeX accent commands or directly with UTF-8 \
characters, depending on the setup, to allow for testing \
extended Latin alphabets. The supplementary package \
testidx-glossaries.sty uses the indexing interface provided by \
the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60966"

RPM_NAME = "texlive-testidx-2023.209.1.2svn60966-55.1.noarch.rpm"
RPM_HASH = "453a902efea09d22d31c7d122abbd0dd4241ab800ba6bab61ae787ffe0d65e81161bab540759ab9ff18a9814f662053253afb1f355002d75f4a5c17fb4d792a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-testidx-glossaries-diglyphs.tex \
tex-testidx-glossaries-nodiglyphs.tex \
tex-testidx-glossaries-samples.tex \
tex-testidx-glossaries.sty \
tex-testidx.sty \
texlive-testidx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-glossary-mcols.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
