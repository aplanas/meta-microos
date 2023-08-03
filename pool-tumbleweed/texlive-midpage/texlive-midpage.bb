SUMMARY = "Environment for vertical centring"
DESCRIPTION = "The environment will centre text, if immediately preceded and \
followed by \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn17484"

RPM_NAME = "texlive-midpage-2023.209.1.1asvn17484-55.1.noarch.rpm"
RPM_HASH = "4ff7e812664984a5b9c688b0a07edec3293fbe75fb2a28b5eedf6f62e30b2a8c78f54127d66bef18c84feba90ce0f6fad4028618d3ebb5c8de3262d688f60703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-midpage.sty \
texlive-midpage"

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
