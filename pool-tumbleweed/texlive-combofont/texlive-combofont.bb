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

PV = "2023.209.0.0.3svn51348"

RPM_NAME = "texlive-combofont-2023.209.0.0.3svn51348-54.1.noarch.rpm"
RPM_HASH = "08386bf4cdea00866a889c528ef25eb7644172218cb5ca8eaac8fdc7bfd120734d523daa92fab17d6470a230e5de806d27b83438998f1afde6bd2c362e4af9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-combofont.sty \
texlive-combofont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
