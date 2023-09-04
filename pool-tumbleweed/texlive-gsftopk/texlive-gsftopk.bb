SUMMARY = "Convert 'Ghostscript fonts' to PK files"
DESCRIPTION = "Designed for use with xdvi and dvips this utility converts \
Adobe Type 1 fonts to PK bitmap format. It should not \
ordinarily be much used nowadays, since both its target \
applications are now capable of dealing with Type 1 fonts, \
direct."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-2023.209.1.19.2svn52851-54.2.noarch.rpm"
RPM_HASH = "8855a2da21fbd1ea71fd1a097cb15bac2d51df8d42d7aeafe35ef13cd8358abe8b3bdd0bb05344e6736e8582d1ab9f9847006728d3896cac7fa57144c697dc2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsftopk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gsftopk-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
