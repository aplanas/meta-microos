SUMMARY = "Utility programs for Polish users of TeX"
DESCRIPTION = "Provided as sources, not installed in the bin directories."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustprog-2023.209.svn54074-54.2.noarch.rpm"
RPM_HASH = "ccf91a74c02ca241b5a04d06d851c2155270ce14e832e0e6730ffb9037f84178fa63e3bc53a29d28a10ba110ecf907cd704c6dfc5e7d35f41b5b21b69496685f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustprog"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
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
