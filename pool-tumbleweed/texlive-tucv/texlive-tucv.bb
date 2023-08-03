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

PV = "2023.209.1.0svn20680"

RPM_NAME = "texlive-tucv-2023.209.1.0svn20680-53.1.noarch.rpm"
RPM_HASH = "f68356af6ce785f82ac0599e5e2921f29b8917b24317eadcd3c7f6923ee83f1f321afe197e7c8aee7fc4eda92994eb91d24196a90d13dc1261150f737a1d4e4f"
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
