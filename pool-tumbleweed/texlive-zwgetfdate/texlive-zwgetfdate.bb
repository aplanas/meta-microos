SUMMARY = "Get package or file date"
DESCRIPTION = "The package can fetch the date declaration of packages and \
files used by a document, and then provide the information in \
macros. The facilities provide a means of obtaining the date of \
a package being documented; this is mainly of use when \
doc/docstrip."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-zwgetfdate-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "c2267c41dabf95348f57d6b050a82d4a8d5e81df9a8594a69edd56bea1bcb99e8f7d9bd1e0eab9ddc262cdfd2fff4c3c5581ad0a35c4167f4f64992908d09c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwgetfdate.sty \
texlive-zwgetfdate"

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
