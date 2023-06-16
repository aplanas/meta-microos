SUMMARY = "Produce formatted program listings"
DESCRIPTION = "The listing environment is provided and is similar to figure \
and table, although it is not a floating environment. Includes \
support for \\caption, \\label, \\ref, and introduces \
\\listoflistings, \\listingname, \\listlistingname. It produces a \
.lol file. It does not change \\@makecaption (unless the option \
bigcaptions is used), so packages that change the layout of \
\\caption still work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn17373"

RPM_NAME = "texlive-listing-2023.201.1.2svn17373-54.1.noarch.rpm"
RPM_HASH = "7fce0aeb85ce62acfdac1428ae4673d32f8ddad69f8ccfb8f995a4f671bc775e888aa2d9b854c5921a9fc3463247e4b0c97570a87c4c6fa0be0d44ae05fa09c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listing.sty \
texlive-listing"

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
