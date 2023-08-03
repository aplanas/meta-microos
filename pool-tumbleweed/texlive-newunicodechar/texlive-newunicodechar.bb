SUMMARY = "Definitions of the meaning of Unicode characters"
DESCRIPTION = "The package provides a friendly interface for defining the \
meaning of Unicode characters. The document should be processed \
by (pdf)LaTeX with the unicode option of inputenc or inputenx, \
or by XeLaTeX/LuaLaTeX. The command provided is \
\\newunicodechar{<char>}{<code>} where <char> is a \
directly-typed Unicode character, and <code> is its \
replacement."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47382"

RPM_NAME = "texlive-newunicodechar-2023.209.1.2svn47382-55.1.noarch.rpm"
RPM_HASH = "316bc00344fdf8d6fd5db873a486b1b345f51098d96a92872756a0a106488b9a1914b331aab27e25147af551e7843954ebf05ec47a5c540b85764a80968c45da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newunicodechar.sty \
texlive-newunicodechar"

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
