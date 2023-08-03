SUMMARY = "Visual help for PSTricks based on images with minimum text"
DESCRIPTION = "Visual help for PSTricks based on images with minimum text. One \
image per command or per parameter."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn39799"

RPM_NAME = "texlive-visualpstricks-2023.209.2.3svn39799-54.1.noarch.rpm"
RPM_HASH = "1333aa0ba5acd9d18c0e4d5bcfd76303f476f652205ec04fb98704f4b05e606f76ae561a3ee0013f68c4b77de695e62b862717084249774c1ba7683834085390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualpstricks"

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
