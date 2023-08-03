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

PV = "2023.209.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-2023.209.0.0.4.7svn44238-53.1.noarch.rpm"
RPM_HASH = "9c998c6bcd591cb6da5c807a314f920f5feee75cc18925cd326eb80711401313d615479ed9ac72eb49422e06f0167e7d0728723873b038711d0899fba1aaf5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typoaid.sty \
texlive-typoaid"

RDEPENDS:${PN} += "/usr/bin/sh \
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
