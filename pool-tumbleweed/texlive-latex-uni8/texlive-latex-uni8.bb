SUMMARY = "Universal inputenc, fontenc, and babel for pdfLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a LaTeX style file which makes it easy to \
use input encoding (UTF-8 by default, can be changed), \
fontspec.sty (optional), font encoding (T1 if fontspec.sty is \
not used), babel (English language by default), hyphenation, \
underline (with soul.sty), default text and math fonts \
(Computer Modern or Times), and paper sizes correctly with both \
pdfLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-2023.209.0.0.03svn49729-56.1.noarch.rpm"
RPM_HASH = "246012b596e2b5b6830e0a0e78cb800540c4e788f0ac774a306f050be60a386b6dad75c3dcfc159077ce7de562437a03488826b7ede70a100d580ed048aec004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni8.sty \
texlive-latex-uni8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-lmodern.sty \
tex-mathptmx.sty \
tex-soul.sty \
tex-soulutf8.sty \
tex-tgcursor.sty \
tex-tgheros.sty \
tex-tgtermes.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
