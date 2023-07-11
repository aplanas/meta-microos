SUMMARY = "Break tables across pages"
DESCRIPTION = "Xtab is an extended and somewhat improved version of \
supertabular; its xtabular environment provides tables that \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3fsvn23347"

RPM_NAME = "texlive-xtab-2023.201.2.3fsvn23347-52.2.noarch.rpm"
RPM_HASH = "63f9529f091e38a280a67d253221be1d939f591d3739698b2cd675a77f47be4fc2a2a6d808ee16333dc905789d138132e5442b160bd27cbfda7e5d64283758a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtab.sty \
texlive-xtab"

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
