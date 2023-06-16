SUMMARY = "Include EPS in MetaPost figures"
DESCRIPTION = "The package facilitates including EPS files in MetaPost \
figures; it makes use of (G)AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-2023.201.0.0.2svn29349-53.1.noarch.rpm"
RPM_HASH = "3d54100a3d07780ee527fba542a6b5832e0ade59e7d17c5e2a39fc57dcd204db54f5e08581c612d81b8631016721d66f8f15a3e3056f85a73ddde4ec0108a060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl"

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
