SUMMARY = "Bullshit bingo, calendar and baseball-score cards"
DESCRIPTION = "Three jiffy packages for creating cards of various sorts with \
MetaPost."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-bbcard-2023.209.svn19440-54.1.noarch.rpm"
RPM_HASH = "e772c6cd28b630504ed4a74ef25c7801e41a6890b953c13d4ec8e610ba8d5abb54165c87fa35bb9c762054391de43318b0092d19cc96f4431e1ef8eb3b658a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard"

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
