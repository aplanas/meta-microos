SUMMARY = "Translate input files on the fly"
DESCRIPTION = "The package preprocesses input files to a Lua(La)TeX run, on \
the fly. The user defines Lua regular expressions to search for \
patterns and modify input lines (or entire paragraphs) \
accordingly, before TeX reads the material. In this way, \
documents may be prepared in a non-TeX language (e.g., some \
lightweight markup language) and turned into 'proper' TeX for \
processing. The source of the documentation is typed in such a \
lightweight language and is thus easily readable in a text \
editor (the PDF file is also available, of course); the \
transformation to TeX syntax via Interpreter's functions is \
explained in the documentation itself. Interpreter is \
implemented using the author's gates (lua version), and works \
for plain TeX and LaTeX, but not ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn27232"

RPM_NAME = "texlive-interpreter-2023.209.1.2svn27232-54.1.noarch.rpm"
RPM_HASH = "37bf85cbd0215aaae8bfa73e1607d197d1cbc9b3e1034000f24478116855314b85f96befd7cde07093dcffd9b5cef4b88104d009c0fb32b85aa93da8349716c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interpreter.sty \
tex-interpreter.tex \
texlive-interpreter"

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
