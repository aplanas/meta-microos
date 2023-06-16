SUMMARY = "'Chicago' bibliography style with annotations"
DESCRIPTION = "This is a modification of the author's chicago style, to \
support an 'annotation' field in bibliographies."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52567"

RPM_NAME = "texlive-chicagoa-2023.201.svn52567-53.1.noarch.rpm"
RPM_HASH = "6d14644d5bfa8eba184c0e39d4c9022d48243bd230d7207c417f705a6caf09a6efab8f27f63157e2e06b636eebec9396e7dcf8e0275b18bbb51e2e10ff9d3ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicagoa"

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
