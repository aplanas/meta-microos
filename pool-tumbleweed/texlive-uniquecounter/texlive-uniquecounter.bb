SUMMARY = "Provides unlimited unique counter"
DESCRIPTION = "This package provides a kind of counter that provides unique \
number values. Several counters can be created with different \
names. The numeric values are not limited."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn53162"

RPM_NAME = "texlive-uniquecounter-2023.201.1.4svn53162-53.1.noarch.rpm"
RPM_HASH = "8decc10c88aca5bb2462798f7fb2a6072e82a12a5c98f74ba541eed84729a7dbe5f339af34a868764848ade67c26ed91f5d7d5dc2bd094f749fbd30f49be4f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uniquecounter.sty \
texlive-uniquecounter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bigintcalc.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
