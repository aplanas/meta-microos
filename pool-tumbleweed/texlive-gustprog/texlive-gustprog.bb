SUMMARY = "Utility programs for Polish users of TeX"
DESCRIPTION = "Provided as sources, not installed in the bin directories."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-gustprog-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "653a4635584b01c0ba81a32789452163a3facb52f55349744cb17f197d5790bf4691ec10e14be9038a62d53a06fc3a6ffb2e7e2cffb180e9a678f712f1d0f968"
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
