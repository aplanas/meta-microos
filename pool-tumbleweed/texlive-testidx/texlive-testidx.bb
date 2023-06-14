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

PV = "2023.201.1.2svn60966"

RPM_NAME = "texlive-testidx-2023.201.1.2svn60966-54.1.noarch.rpm"
RPM_HASH = "1970cb2dab4ecaca5684e6b0c3012ff07ec4cb3968cfac40ad7c43eb70334763374232f12822cd1f3b79e15e349251f27678f7c6705b60c008ea99730e196d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-testidx-glossaries-diglyphs.tex \
tex-testidx-glossaries-nodiglyphs.tex \
tex-testidx-glossaries-samples.tex \
tex-testidx-glossaries.sty \
tex-testidx.sty \
texlive-testidx"

RDEPENDS:${PN} += "/bin/sh \
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
