SUMMARY = "Fixes for mathematics-related LuaLaTeX issues"
DESCRIPTION = "The package patches a few commands of the LaTeX2e kernel and \
the amsmath and mathtools packages to be more compatible with \
the LuaTeX engine. It is only meaningful for LuaLaTeX documents \
containing mathematical formulas, and does not exhibit any new \
functionality. The fixes are mostly moved from the unicode-math \
package to this package since they are not directly related to \
Unicode mathematics typesetting."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12svn61464"

RPM_NAME = "texlive-lualatex-math-2023.201.1.12svn61464-52.1.noarch.rpm"
RPM_HASH = "ee693374688eb77e5471b624fab9bedb4fce9ee6e67c99a178c43835af93af6bbeaab165c79f9711347ecefda6a0fbe00fa943a4be3ff77bfd771410261b34f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lualatex-math.sty \
texlive-lualatex-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-luatexbase.sty \
texlive \
texlive-etoolbox \
texlive-filehook \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
