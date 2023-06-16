SUMMARY = "Convert composite accented characters to Unicode"
DESCRIPTION = "This small utility, written in SNOBOL, converts the composition \
of special characters to Unicode, e. g. \\'{a} - a, \\k{a} - a, \
..."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-2023.201.1.0.1svn64447-54.1.noarch.rpm"
RPM_HASH = "bccae94f0b79afd91fc993cad086122b182cc85757058b9c272bb4e69078580f7a134d396c8a35e97425699cb219a6018e64c2ed23fdfa2a5a76f73825a252c0"
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
