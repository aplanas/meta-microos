SUMMARY = "Use lua callbacks for 'interesting' textual effects"
DESCRIPTION = "The package allows manipulations of any LuaTeX document (it is \
known to work with Plain LuaTeX and LuaLaTeX). Most of the \
package's functions are merely for fun or educational use, but \
some functions (for example, colorstretch for visualising the \
badness and font expansion of each line, and letterspaceadjust \
doing what its name says) could be useful in a 'normal' LuaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn57325"

RPM_NAME = "texlive-chickenize-2023.209.0.0.3svn57325-54.1.noarch.rpm"
RPM_HASH = "f5d5f52e6a00b6c8bda969ecd0e86d736b698924efa69eebef3501c82b041347c9109a1c1fc72c0a07b5b791e0c8c0fc189394e85f42238b4a238f21d8e823fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chickenize.sty \
tex-chickenize.tex \
texlive-chickenize"

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
