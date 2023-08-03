SUMMARY = "Clean up title references"
DESCRIPTION = "Cleans up the title string (removing \\label commands) for \
packages (such as nameref) that typeset such strings."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53170"

RPM_NAME = "texlive-gettitlestring-2023.209.1.6svn53170-53.1.noarch.rpm"
RPM_HASH = "f3452df4d7adfd4c5f38d679a7dc6a0f10c6efaaf5034dbd85b6c8220a305efc144c6cf5ab911071131d6c2bff6d893c6c0e994f335a1349742a790c3ab58e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gettitlestring.sty \
texlive-gettitlestring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
