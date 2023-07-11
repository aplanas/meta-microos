SUMMARY = "Use citation keys from a different document"
DESCRIPTION = "The package xcite is no longer necessary, because its \
functionality has been taken over by xr, so this final version \
is just a stub that loads xr."
LICENSE = "LPPL-1.0"

PV = "2023.201.16383.99998svn53486"

RPM_NAME = "texlive-xcite-2023.201.16383.99998svn53486-52.2.noarch.rpm"
RPM_HASH = "6e4c63a358de4e6eee0bf73446438a5a6432cc3eb314618de8ccce22ca09d5dfd4f1d9ab70fdb1249b8e1383ed5293b2e52a3d582ff5730ff922d2b4093510a4"
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
