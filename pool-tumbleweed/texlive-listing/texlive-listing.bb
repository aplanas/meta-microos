SUMMARY = "Produce formatted program listings"
DESCRIPTION = "The listing environment is provided and is similar to figure \
and table, although it is not a floating environment. Includes \
support for \\caption, \\label, \\ref, and introduces \
\\listoflistings, \\listingname, \\listlistingname. It produces a \
.lol file. It does not change \\@makecaption (unless the option \
bigcaptions is used), so packages that change the layout of \
\\caption still work."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn17373"

RPM_NAME = "texlive-listing-2023.209.1.2svn17373-55.1.noarch.rpm"
RPM_HASH = "74235438bd6b229ecc26ba199695d820cb98225c728626b73c621da7c92f0df83b5301e4ecfe2bf1e8906cb767de25a2ad3b4743f8a57bf604ba085238dbf845"
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
