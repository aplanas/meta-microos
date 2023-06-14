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

PV = "2023.201.0.0.3.0svn65878"

RPM_NAME = "texlive-citation-style-language-2023.201.0.0.3.0svn65878-53.1.noarch.rpm"
RPM_HASH = "19c81c7df6e5e9f24a0a56f7c8f9c9b2c4361d7cfe54df61400ad693b65db945d75c399f1277e25bf9bb3676504d3c33f793d5023944be4538def05b683b2b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citation-style-language.sty \
texlive-citation-style-language"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
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
