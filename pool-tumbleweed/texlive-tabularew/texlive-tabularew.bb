SUMMARY = "A variation on the tabular environment"
DESCRIPTION = "The package offers a modification of the tabular environment, \
which deals with the problem of column heads that are \
significantly wider than the body of the column."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "d39c8ec6de9a8f883f65f326c555936d130cfdbaccb6412b4cc6eda7e213f557ed86845ec375083e0ca0570913461c6e233ff1564014604bce10f137c7790b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularew.sty \
texlive-tabularew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
