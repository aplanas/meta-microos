SUMMARY = "A simplified documentation for tlmgr"
DESCRIPTION = "This package provides simplified documentation for tlmgr, the \
TeX Live Manager. It describes the most commonly-used actions \
and options in a convenient format."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66271"

RPM_NAME = "texlive-tlmgrbasics-2023.209.svn66271-53.1.noarch.rpm"
RPM_HASH = "c271fb828ea8a5bfa52087a2846bfb15e7dea9720bd5f768a5f61c8485cc69ce8d5ec2f331cc513d382ab5bafc9a04aa1aff17ccd58d2cf92b1c186b2054e24d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgrbasics"

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
