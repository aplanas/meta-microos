SUMMARY = "An OTF math font matching EB Garamond"
DESCRIPTION = "Garamond-Math is an open type math font matching EB Garamond \
(Octavio Pardo) and EB Garamond (Georg Mayr-Duffner). Many \
mathematical symbols are derived from other fonts, others are \
made from scratch. The metric is generated with a Python \
script. Issues, bug reports and other contributions are \
welcome."
LICENSE = "OFL-1.1"

PV = "2023.209.svn61481"

RPM_NAME = "texlive-garamond-math-2023.209.svn61481-53.1.noarch.rpm"
RPM_HASH = "c3abe545a9f842854683be30312b4b698e01137dc047ee735a51242adb24e099564e30d979ebe25bc62bbccb046297a5a4bcd47107a47825be0077703f833c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garamond-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-garamond-math-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
