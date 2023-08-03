SUMMARY = "PDF Math Symbols -- various drawn mathematical symbols"
DESCRIPTION = "This package defines a handful of mathematical symbols many of \
which are implemented via PDF's builtin drawing utility. It is \
intended for use with pdfTeX and LuaTeX and is supported by \
XeTeX to a lesser extent. Among the symbols it defines are some \
variants of commonly used ones, as well as more obscure symbols \
which cannot be as easily found in other TeX or LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65324"

RPM_NAME = "texlive-pdfmsym-2023.209.1.1.0svn65324-52.1.noarch.rpm"
RPM_HASH = "b1e752001094f06941032b8ea6fd9e43d9862f388bfd5f85804f37ab79c2dfbc93e734880ab0b234bd7d21a2f51cf3a4978a9bc5a3deeb263602415b1024b734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfmsym.tex \
texlive-pdfmsym"

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
