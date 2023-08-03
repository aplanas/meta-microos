SUMMARY = "Bibliography formatting with Citation Style Language"
DESCRIPTION = "The Citation Style Language (CSL) is an XML-based language that \
defines the formats of citations and bibliography. There are \
currently thousands of styles in CSL including the most widely \
used APA, Chicago, Vancouver, etc. The citation-style-language \
package is aimed to provide another reference formatting method \
for LaTeX that utilizes the CSL styles. It contains a citation \
processor implemented in pure Lua (citeproc-lua) which reads \
bibliographic metadata and performs sorting and formatting on \
both citations and bibliography according to the selected CSL \
style. A LaTeX package (citation-style-language.sty) is \
provided to communicate with the processor."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn65878"

RPM_NAME = "texlive-citation-style-language-2023.209.0.0.3.0svn65878-54.1.noarch.rpm"
RPM_HASH = "d16c931937658d49ad37c79d3e8a1ee7bd4ec692f477f79386b245faf17877d1ae497aa09d4297eb6535a5271d2194dbccb3ceefe07515244f0d70882fd47cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citation-style-language.sty \
texlive-citation-style-language"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-filehook.sty \
tex-l3keys2e.sty \
tex-url.sty \
tex-xparse.sty \
texlive \
texlive-citation-style-language-bin \
texlive-filehook \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-lua-uca \
texlive-lualibs \
texlive-luatex \
texlive-luaxml \
texlive-scripts \
texlive-scripts-bin \
texlive-url"

inherit rpm
