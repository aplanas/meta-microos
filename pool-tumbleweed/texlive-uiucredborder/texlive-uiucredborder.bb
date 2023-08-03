SUMMARY = "Class for UIUC thesis red-bordered forms"
DESCRIPTION = "The class offers a means of filling out the 'red-bordered form' \
that gets signed by the department head, your advisor, and -- \
for doctoral dissertations -- your thesis committee members."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-2023.209.1.00svn29974-54.1.noarch.rpm"
RPM_HASH = "c68cf49cdff3f7d299f86b4c2655adfe5925fdcfd7cf3886c693aedf5ec6924571ef6404eb32234d87f9c37c24b0ccf2b82bac5990d91fdef499a3ffe1f28d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uiucredborder.cls \
texlive-uiucredborder"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
