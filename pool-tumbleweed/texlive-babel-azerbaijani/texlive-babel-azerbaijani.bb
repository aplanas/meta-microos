SUMMARY = "Support for Azerbaijani within babel"
DESCRIPTION = "This is the babel style for Azerbaijani. This language poses \
special challenges because no 'traditional' font encoding \
contains the full character set, and therefore a mixture must \
be used (e.g., T2A and T1). This package is compatible with \
Unicode engines (LuaTeX, XeTeX), which are very likely the most \
convenient way to write Azerbaijani documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn44197"

RPM_NAME = "texlive-babel-azerbaijani-2023.209.1.0asvn44197-54.1.noarch.rpm"
RPM_HASH = "c486cf5ebf25aac9e700ceaff7a7df838880011950abedf7e2ec933e19e9bcb0614a4ef525a1c5e0f84fba8cd11b8bafd17ba9af7b328bcc3aba65e09909a958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-azerbaijani.ldf \
texlive-babel-azerbaijani"

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
