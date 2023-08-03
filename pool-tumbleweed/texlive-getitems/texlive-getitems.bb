SUMMARY = "Gathering items from a list-like environment"
DESCRIPTION = "This package provides a \\gatheritems command to parse a list of \
data separated by \\item tokens. This makes it easier to define \
custom environments which structure their data in the same way \
that itemize or enumerate do."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39365"

RPM_NAME = "texlive-getitems-2023.209.1.0svn39365-53.1.noarch.rpm"
RPM_HASH = "24d946584f3154602048c229ee44e1c5fefd9fc22af253ce6768d4f37b5d8967456645bb821c75667cfd466a7526ea33f5b22c06609128a31e4d3231a5da211f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-getitems.sty \
texlive-getitems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
