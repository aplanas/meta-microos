SUMMARY = "Lines thicker in the middle than at the ends"
DESCRIPTION = "Defines commands that create rules split into a (specified) \
number of pieces, whose size varies to produce the effect of a \
rule that swells in its centre."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54267"

RPM_NAME = "texlive-swrule-2023.201.svn54267-57.1.noarch.rpm"
RPM_HASH = "ec696cd91f19b66ee751b81447e44b3b7d8c9d915de8b4c09951f30bd3b2486200544d6c59721ce6d91dccf991b4a1009a49979c5a42080af504e3793d08a0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(swrule.sty) \
texlive-swrule"

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
