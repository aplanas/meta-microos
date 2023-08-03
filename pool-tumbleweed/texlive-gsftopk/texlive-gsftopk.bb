SUMMARY = "Convert 'Ghostscript fonts' to PK files"
DESCRIPTION = "Designed for use with xdvi and dvips this utility converts \
Adobe Type 1 fonts to PK bitmap format. It should not \
ordinarily be much used nowadays, since both its target \
applications are now capable of dealing with Type 1 fonts, \
direct."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-2023.209.1.19.2svn52851-54.1.noarch.rpm"
RPM_HASH = "b77d2d82f7b2c02a29832496304f0c3297845da0c26e3007264250279c20c9cfc4061cfb8a8a63048a0b66cf9240fab795b635490bb637d7d65d8a6187756119"
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
