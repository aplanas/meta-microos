SUMMARY = "'Chicago' bibliography style with annotations"
DESCRIPTION = "This is a modification of the author's chicago style, to \
support an 'annotation' field in bibliographies."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52567"

RPM_NAME = "texlive-chicagoa-2023.209.svn52567-54.1.noarch.rpm"
RPM_HASH = "c5b3975d84970b323a8ab1014c6f91fa137717baddb141b2a6c34e0baff681cef34da432f1ae891222fff92c60e24e51b69307e8958e4a40ae0eb939a8edcfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicagoa"

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
