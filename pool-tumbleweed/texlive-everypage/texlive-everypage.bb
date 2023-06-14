SUMMARY = "Provide hooks to be run on every page of a document"
DESCRIPTION = "The package provides hooks to perform actions on every page, or \
on the current page. Specifically, actions are performed after \
the page is composed, but before it is shipped, so they can be \
used to prepare the output page in tasks like putting \
watermarks in the background, or in setting the next page \
layout, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn56694"

RPM_NAME = "texlive-everypage-2023.201.2.0bsvn56694-52.1.noarch.rpm"
RPM_HASH = "6b7c4226e8d3bd7407af321edf920ba37039082603dc058cd425830a07f18c40e458fa826b308934fa23218ccc28b3ba9af370b03c1f289dccb44299ac36dc56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everypage-1x.sty \
tex-everypage.sty \
texlive-everypage"

RDEPENDS:${PN} += "/bin/sh \
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
