SUMMARY = "Macros for font diagnostics"
DESCRIPTION = "This package provides macros for measuring alphabet lengths \
(i.e. the length occupied by the characters 'abcd...xyz'), \
em-widths and ex-heights, which may help in making typesetting \
decisions. The package is compatible with pdfLaTeX, LuaLaTeX, \
and XeLaTeX, and will accept font family switches defined via \
the fontspec package. The plan is that future versions shall be \
able to provide even more diagnostic tools, and some \
LuaTeX-specific special commands, too. The package relies on \
the following other LaTeX packages: expl3, array, booktabs, and \
siunitx."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-2023.201.0.0.4.7svn44238-52.1.noarch.rpm"
RPM_HASH = "e1486c033c8a24c282a2db98ece46caddc9fd0d598ad735d7e22ede9c00f076cd1539abc3f3734b465aed416725f325183b288a68f3f10fd46073140de7f87fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typoaid.sty \
texlive-typoaid"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-expl3.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
