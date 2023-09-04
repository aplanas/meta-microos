SUMMARY = "Get package or file date"
DESCRIPTION = "The package can fetch the date declaration of packages and \
files used by a document, and then provide the information in \
macros. The facilities provide a means of obtaining the date of \
a package being documented; this is mainly of use when \
doc/docstrip."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-zwgetfdate-2023.209.svn15878-53.2.noarch.rpm"
RPM_HASH = "51a0c10f5856ac486d0b92b721dd504556d5ecaf1e4276ce1d15a1259075ec83a12757284112a3d3036dd02dd438b0244269b86b68ad44f1b0c2b12e80b1e16d"
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
