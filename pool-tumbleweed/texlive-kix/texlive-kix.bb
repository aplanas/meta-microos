SUMMARY = "Typeset KIX codes"
DESCRIPTION = "Implements KIX codes as used by the Dutch PTT for bulk mail \
addressing. (Royal Mail 4 State Code.) KIX is a registered \
trade mark of PTT Post Holdings B. V."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21606"

RPM_NAME = "texlive-kix-2023.201.svn21606-55.1.noarch.rpm"
RPM_HASH = "d148550f3092aca895239a681bcf501bbf9c35f7c4d1cd2e9b46daca9c8497462a3721865372e07dd1b88fa3964b4269354cae422039156165a331150f728ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kix.sty) \
texlive-kix"

RDEPENDS:${PN} += "/bin/sh \
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
