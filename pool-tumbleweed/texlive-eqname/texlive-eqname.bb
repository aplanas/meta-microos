SUMMARY = "Name tags for equations"
DESCRIPTION = "The \\eqname command provides a name tag for the current \
equation, in place of an equation number. The name tag will be \
picked up by a subsequent \\label command."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20678"

RPM_NAME = "texlive-eqname-2023.209.svn20678-54.1.noarch.rpm"
RPM_HASH = "b8a0784e166c0188021455efde9cb9eba1f19f13f0475be0d8ccfa210e93bf41faf88d91787828d465f4870a04f98af5709a0724e2cf6668390314736db55575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqname.sty \
texlive-eqname"

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
