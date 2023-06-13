SUMMARY = "Automatically remove widows and orphans from any document"
DESCRIPTION = "Unmodified TeX has very few ways of preventing widows and \
orphans. In documents with figures, section headings, and \
equations, TeX can stretch the vertical glue between items in \
order to prevent widows and orphans, but many documents have no \
figures or headings. TeX can also shorten the page by 1 line, \
but this will give each page a different length which can make \
a document look uneven. The typical solution is to \
strategically insert \\looseness=1, but this requires manual \
editing every time that the document is edited. \
Lua-widow-control is essentially an automation of the \
\\looseness method: it uses Lua callbacks to find 'stretchy' \
paragraphs, then it lengthens them to remove widows and \
orphans. Lua-widow-control is compatible with all LuaTeX and \
LuaMetaTeX-based formats. All that is required is to load the \
package at the start of your document. To load: Plain LuaTeX: \
\\input lua-widow-control LuaLaTeX: \
\\usepackage{lua-widow-control} ConTeXt: \
\\usemodule[lua-widow-control] OpTeX: \\load[lua-widow-control]"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.0svn65084"

RPM_NAME = "texlive-lua-widow-control-2023.201.3.0.0svn65084-52.1.noarch.rpm"
RPM_HASH = "3fb7fa0a7821b609742361f51a5d7bd98e5766765731b6d768eb16a814133a99346a20b41806e9ac25c9ebae0a481dbe2020fd5e734e0a84b2aa35c27d5534fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lua-widow-control-2022-02-22.sty) \
tex(lua-widow-control.sty) \
tex(lua-widow-control.tex) \
texlive-lua-widow-control"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(l3keys2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
