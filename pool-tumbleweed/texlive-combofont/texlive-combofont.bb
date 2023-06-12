SUMMARY = "Add NFSS-declarations of combo fonts to LuaLaTeX documents"
DESCRIPTION = "This highly experimental package can be used to add \
NFSS-declarations of combo fonts to LuaLaTeX documents. This \
package may disappear without notice, e.g. if luaotfload \
changes in a way so that it no longer works, or if LuaTeX \
changes, or if fontspec itself includes the code. It is also \
possible that the package's syntax and commands may change in \
an incompatible way. So if you use it in a production \
environment: You have been warned."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn51348"

RPM_NAME = "texlive-combofont-2023.201.0.0.3svn51348-53.1.noarch.rpm"
RPM_HASH = "d5758985785f19970a88139b1d8a7ada7ffaab8c035ce7ed7a1d14d37270dbeece9af6ff0fed4c485cb6e6a2e8ae7efebd69d94cef2bcd3cebfe99cd05f804da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(combofont.sty) \
texlive-combofont"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xfp.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
