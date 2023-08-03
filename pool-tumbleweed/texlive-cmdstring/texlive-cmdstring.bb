SUMMARY = "Get command name reliably"
DESCRIPTION = "Extracts the letters of a command's name (e.g., foo for command \
\\foo), in a reliable way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-cmdstring-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "9df775a57a10701a0cf4400930f1d024dcb65b995875b37edccd329e2d67366fd25734e3c831490552d3dbe49e4f2276013da74bfba29ce2fa3cb3a69c00199e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdstring.sty \
texlive-cmdstring"

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
