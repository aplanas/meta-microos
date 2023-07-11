SUMMARY = "Convert 'Ghostscript fonts' to PK files"
DESCRIPTION = "Designed for use with xdvi and dvips this utility converts \
Adobe Type 1 fonts to PK bitmap format. It should not \
ordinarily be much used nowadays, since both its target \
applications are now capable of dealing with Type 1 fonts, \
direct."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-2023.201.1.19.2svn52851-53.2.noarch.rpm"
RPM_HASH = "8722c37587be55ccf9f762773e0a8653eda900b078e74d2f8832201f79eee12349125abb23983e76cc61ca63788daa89aafd6dc9cbfd43c8bee4978d6cf4deef"
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
