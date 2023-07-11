SUMMARY = "Include EPS in MetaPost figures"
DESCRIPTION = "The package facilitates including EPS files in MetaPost \
figures; it makes use of (G)AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-2023.201.0.0.2svn29349-53.2.noarch.rpm"
RPM_HASH = "6d290e7da9145e72c4792c8d0d3bed6dc71f1295aa2e2156a1e8921de853823dfb697155abf294362267d34180bada0277f9def508e58284d11044705f15b9a4"
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
