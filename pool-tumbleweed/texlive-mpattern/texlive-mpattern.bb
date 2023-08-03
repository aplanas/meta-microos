SUMMARY = "Patterns in MetaPost"
DESCRIPTION = "A package for defining and using patterns in MetaPost, using \
the Pattern Color Space available in PostScript Level 2."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-mpattern-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "989c4787b95a3c5b7ba2653efa525ac8407a7ddb3da70d4cd3230b0950358e7b4a2689e6223170687d9df1552b01f5a50e3e2a2b260952e19551040950febbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpattern"

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
