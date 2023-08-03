SUMMARY = "Support for Washington University Cyrillic fonts"
DESCRIPTION = "The package supports the use of the Washington Cyrillic fonts \
with LaTeX (Note that standard LaTeX has support, too, as \
encoding OT2). The package is distributed as part of the fundus \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn26019"

RPM_NAME = "texlive-fundus-cyr-2023.209.svn26019-53.1.noarch.rpm"
RPM_HASH = "b7fe663648013ca702a1bda4aee85feee6ef1edaaba0edbcbe6b775beb214185001c0beacb991f54aef05557c6779c698e9720f793554b3c8f699c6d206ea150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cyr.sty \
texlive-fundus-cyr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cyracc.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
