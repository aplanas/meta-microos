SUMMARY = "Macros for constructing interactive LaTeX scripts"
DESCRIPTION = "Gathers together a bunch of code and examples about how to \
write macros to carry on a dialogue with the user."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28946"

RPM_NAME = "texlive-dialogl-2023.209.svn28946-53.1.noarch.rpm"
RPM_HASH = "0dd677a5727d276f9d48e2f7040b0a92fc074fd526c3af88a0533c63fc547fe3b34b9e6ac81f2e68c4641182fd128ab1d4e32eb478ac51be82f8f8bb2caa4c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dialog.sty \
tex-grabhedr.sty \
tex-listout.tex \
tex-menus.sty \
texlive-dialogl"

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
