SUMMARY = "Change the layout of individual pages and their text"
DESCRIPTION = "The package is an extension of the changepage package to permit \
the user to change the layout of individual pages and their \
texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16094"

RPM_NAME = "texlive-changelayout-2023.209.1.0svn16094-53.1.noarch.rpm"
RPM_HASH = "ad8f160e674c16305b205f1ced479cfc303133a6cd679d13318de6dca42e16f40ce60870323a5a85a401e685f223808b521748ee4de9ea3fc57a9063375bc449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changelayout.sty \
texlive-changelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
