SUMMARY = "Set various page dimensions"
DESCRIPTION = "Provides a macro to set various margins as well as dimensions \
for header/footer and page dimensions. Most common paper sizes, \
paper orientation, disabling of headers and footers, and two \
sided printing are supported. The vmargin package does not rely \
on other packages and was designed with speed and size in mind. \
Its user interface might not be very fancy, but it's fast, \
small, and gets the job done. If you are looking for something \
more elaborate try the geometry package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5svn15878"

RPM_NAME = "texlive-vmargin-2023.209.2.5svn15878-54.1.noarch.rpm"
RPM_HASH = "002462d408a31c4552bab41c5bbef00b218b75f6ccfd85d95d34e226761026b63e127a6f40e98b1889322848c6cd07873087fe5fab9a7c98a7575b984ff3993e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vmargin.sty \
texlive-vmargin"

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
