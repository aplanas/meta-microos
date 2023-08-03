SUMMARY = "Convert composite accented characters to Unicode"
DESCRIPTION = "This small utility, written in SNOBOL, converts the composition \
of special characters to Unicode, e. g. \\'{a} - a, \\k{a} - a, \
..."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-2023.209.1.0.1svn64447-55.1.noarch.rpm"
RPM_HASH = "57ae396b38014ed493feb88bf5291e4d870182f8710f421df7f45868bc361891f3d9e564dea0d6fa77f1cf7c01dbea4720e48d458fd99b976d099f0b686596c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texaccents"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/snobol4 \
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
texlive-scripts-bin \
texlive-texaccents-bin"

inherit rpm
