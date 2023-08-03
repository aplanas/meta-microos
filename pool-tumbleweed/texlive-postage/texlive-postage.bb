SUMMARY = "Stamp letters with >>Deutsche Post<<'s service >>Internetmarke<<"
DESCRIPTION = "The postage package is used for franking letters with \
>>Deutsche Post<<'s online postage service >>Internetmarke<<. \
Note that in order to print valid stamps you must point to a \
valid PDF of >>Deutsche Post<<'s >>Ausdruck 4-spaltig (DIN \
A4)<<."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55920"

RPM_NAME = "texlive-postage-2023.209.1.0svn55920-53.1.noarch.rpm"
RPM_HASH = "bfbb7ba187faed3ba7887d1d38af421fd380f47b806dad326f9492d7b463e023a98f0aa1eb5fc74859a2147dba7d0d0da36ac96aeef80a9fde40d48a281a15b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-postage.sty \
texlive-postage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
