SUMMARY = "Conversion of punctuation in maths mode"
DESCRIPTION = "The package modifies the behaviour of characters in maths mode \
so that: '.' is used as a one-thousand separator (as is common \
in Germany) ',' is used as a decimal separator (as is common in \
Germany) '--' is represented with spacing as appropriate to \
such constructs as '1.000,--'. These conversions may be \
switched on and off."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32279"

RPM_NAME = "texlive-ziffer-2023.209.2.1svn32279-53.1.noarch.rpm"
RPM_HASH = "ab6c80b9a231936b3530795e43a04691bc7c55efd08bd4d81548e8a9d95542d8803ddde4c58d8cc22b284a0d90918a39dd794181b4fff186f26ff959cbbc411e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ziffer.sty \
texlive-ziffer"

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
