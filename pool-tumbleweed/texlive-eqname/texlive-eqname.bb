SUMMARY = "Name tags for equations"
DESCRIPTION = "The \\eqname command provides a name tag for the current \
equation, in place of an equation number. The name tag will be \
picked up by a subsequent \\label command."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20678"

RPM_NAME = "texlive-eqname-2023.201.svn20678-53.1.noarch.rpm"
RPM_HASH = "cafa2937c08f0c6a2c8bf61fb6568a4cf2196351581672bd9e6878a4628c839954dcbb838eeefea2ab8dd4f13fff2da87d11e0ec26379a8f20081aa821335e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eqname.sty) \
texlive-eqname"
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
