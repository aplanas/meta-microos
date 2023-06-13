SUMMARY = "Bullshit bingo, calendar and baseball-score cards"
DESCRIPTION = "Three jiffy packages for creating cards of various sorts with \
MetaPost."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn19440"

RPM_NAME = "texlive-bbcard-2023.201.svn19440-53.1.noarch.rpm"
RPM_HASH = "20e1cab1949c8d7606db78c348fdecf92629b1145889871599efeca193d05482155699411f1f4ec7359016e708df013b0579003a897289ffd59108ac78bcc72e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard"

RDEPENDS:${PN} += "/bin/sh \
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
