SUMMARY = "Include EPS in MetaPost figures"
DESCRIPTION = "The package facilitates including EPS files in MetaPost \
figures; it makes use of (G)AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-2023.209.0.0.2svn29349-54.1.noarch.rpm"
RPM_HASH = "332e57a727cad371347b5163733163063c2e4285472c381b6840abc102a99a190f24378e1cc44f15e451103fa8b6cdc22362ae3ddc75d2dd0b85fb33db011ba1"
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
