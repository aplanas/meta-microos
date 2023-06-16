SUMMARY = "Support for typesetting a CV or resumee"
DESCRIPTION = "The package provides commands for typesetting a CV or resume. \
It provides commands for general-purpose headings, entries, and \
item/description pairs, as well as more specific commands for \
formatting sections, with explicit inclusion of school, degree, \
employer, job, conference, and publications entries. It tends \
to produce a somewhat long and quite detailed document but may \
also be suitable to support a shorter resume. The package \
relies on a 'sufficiently recent' copy of the l3kernel and \
l3packages bundles."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20680"

RPM_NAME = "texlive-tucv-2023.201.1.0svn20680-52.1.noarch.rpm"
RPM_HASH = "c0094f3f791db9ec04cc7d0e9fde41d773ca0a8fcd46a1bed26316df2a814ff973f737f771656e2ad0775281b84e21fa7840e602b31cc6e06632725925b99146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tucv.sty \
texlive-tucv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
