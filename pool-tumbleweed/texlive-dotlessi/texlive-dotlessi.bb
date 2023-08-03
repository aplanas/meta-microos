SUMMARY = "Provides dotless i's and j's for use in any math font"
DESCRIPTION = "The package provides two commands: \\dotlessi and \\dotlessj, \
which give access to dotless i's and j's in math mode. They are \
intended for symbols in non English languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51476"

RPM_NAME = "texlive-dotlessi-2023.209.1.1svn51476-53.1.noarch.rpm"
RPM_HASH = "019c0c745e885e3715616081a9ccae497dd37b49ecc9960921fdbfa5830b292d687e9fbfd9065538fc531aed6eaec5548a1b927822e4f275514fbc50f2052e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotlessi.sty \
texlive-dotlessi"

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
