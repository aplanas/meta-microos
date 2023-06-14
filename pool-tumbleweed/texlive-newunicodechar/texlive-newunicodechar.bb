SUMMARY = "Definitions of the meaning of Unicode characters"
DESCRIPTION = "The package provides a friendly interface for defining the \
meaning of Unicode characters. The document should be processed \
by (pdf)LaTeX with the unicode option of inputenc or inputenx, \
or by XeLaTeX/LuaLaTeX. The command provided is \
\\newunicodechar{<char>}{<code>} where <char> is a \
directly-typed Unicode character, and <code> is its \
replacement."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47382"

RPM_NAME = "texlive-newunicodechar-2023.201.1.2svn47382-54.1.noarch.rpm"
RPM_HASH = "3e585c19a38521ec795d516564a01d4d2a645740fe6eaa182034187ecf243e000d0a3b53817ecbfa28ec6b232bb04a5c6b789c71ff5f7ae11126cd595e3973a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newunicodechar.sty \
texlive-newunicodechar"

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
