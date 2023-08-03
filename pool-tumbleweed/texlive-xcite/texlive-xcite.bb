SUMMARY = "Use citation keys from a different document"
DESCRIPTION = "The package xcite is no longer necessary, because its \
functionality has been taken over by xr, so this final version \
is just a stub that loads xr."
LICENSE = "LPPL-1.0"

PV = "2023.209.16383.99998svn53486"

RPM_NAME = "texlive-xcite-2023.209.16383.99998svn53486-53.1.noarch.rpm"
RPM_HASH = "31faca2ef6d49ea9653aa3fe028a6c813a9061001cae16d52503364d5c82b8a1f046f4eb671c5872031a3737b74f80ffe10d6202dce722588b8f1995a0b06eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcite.sty \
texlive-xcite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
