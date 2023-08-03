SUMMARY = "Bibliography styles for German texts"
DESCRIPTION = "A set of bibliography styles that conformt to DIN 1505, and \
match the original BibTeX standard set (plain, unsrt, alpha and \
abbrv), together with a style natdin to work with natbib."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19441"

RPM_NAME = "texlive-din1505-2023.209.svn19441-53.1.noarch.rpm"
RPM_HASH = "2d049defc9e33ef43e8cfbe4a681e60aec3eb3677ac0608a616ddb96d74a944bd97410a88fd2786e0535fef65390c132e72c31543af563ad90deefcdebaaa274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505"

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
