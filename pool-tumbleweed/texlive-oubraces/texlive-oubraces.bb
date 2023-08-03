SUMMARY = "Braces over and under a formula"
DESCRIPTION = "Provides a means to interleave \\overbrace and \\underbrace in \
the same formula."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21833"

RPM_NAME = "texlive-oubraces-2023.209.svn21833-55.1.noarch.rpm"
RPM_HASH = "2af50c1448ddf8eb0c2dd0ca18e4adcf76f9d8eff38fdf753b15dafc9dcc9c05e5755da685bbe27c52269b764d35009ac6f5107022259396f11a6d769439aa3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oubraces.sty \
texlive-oubraces"

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
