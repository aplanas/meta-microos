SUMMARY = "Rudimentary C++-like namespaces in LaTeX"
DESCRIPTION = "The namespc package adds rudimentary C++-like namespace \
functionality to LaTeX. It may be used to declare local LaTeX \
commands, which can be made accessible in a later contexts \
without defining them globally."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-namespc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "3912dea317af96a702fb1d3547648d5e324450d97e55c6df5864b1c962302ea9d04ef70abac4e4ae950e06cdf3015c0cb20ca8f8d356086b5f0183911d1d6872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namespc.sty \
texlive-namespc"

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
