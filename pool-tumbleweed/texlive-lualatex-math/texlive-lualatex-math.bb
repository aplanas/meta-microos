SUMMARY = "Fixes for mathematics-related LuaLaTeX issues"
DESCRIPTION = "The package patches a few commands of the LaTeX2e kernel and \
the amsmath and mathtools packages to be more compatible with \
the LuaTeX engine. It is only meaningful for LuaLaTeX documents \
containing mathematical formulas, and does not exhibit any new \
functionality. The fixes are mostly moved from the unicode-math \
package to this package since they are not directly related to \
Unicode mathematics typesetting."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.12svn61464"

RPM_NAME = "texlive-lualatex-math-2023.208.1.12svn61464-53.1.noarch.rpm"
RPM_HASH = "ea820d6bad9b6e2c6326f5d757541d6d032fa1c681201c62e3654fd7e6340519906394f4a21e9f8eb514c81343c7c25b1441a5dccf6266b5b9dbe7725743473f"
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
