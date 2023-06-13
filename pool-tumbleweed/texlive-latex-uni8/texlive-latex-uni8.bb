SUMMARY = "Universal inputenc, fontenc, and babel for pdfLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a LaTeX style file which makes it easy to \
use input encoding (UTF-8 by default, can be changed), \
fontspec.sty (optional), font encoding (T1 if fontspec.sty is \
not used), babel (English language by default), hyphenation, \
underline (with soul.sty), default text and math fonts \
(Computer Modern or Times), and paper sizes correctly with both \
pdfLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-2023.201.0.0.03svn49729-55.1.noarch.rpm"
RPM_HASH = "258fa0f836551e753217e5fb8db581d63f365a7a81dd787d326c0b87b4bce3cfe0d0539506a18945062d3fd5cea90023445bbeaf922d1b2ffe16378b8143f19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uni8.sty) \
texlive-latex-uni8"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(fontspec.sty) \
tex(lmodern.sty) \
tex(mathptmx.sty) \
tex(soul.sty) \
tex(soulutf8.sty) \
tex(tgcursor.sty) \
tex(tgheros.sty) \
tex(tgtermes.sty) \
tex(unicode-math.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
