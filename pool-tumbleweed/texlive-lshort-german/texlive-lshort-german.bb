SUMMARY = "German version of A Short Introduction to LaTeX2e: LaTeX2e-Kurzbeschreibung"
DESCRIPTION = "The lshort-german package"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0csvn55643"

RPM_NAME = "texlive-lshort-german-2023.201.3.0csvn55643-54.1.noarch.rpm"
RPM_HASH = "d1ac919d51abbb303c0539a176a99d62f297f7e70bb8e8cf7740087e179dc9eead0dd5929964f6df82f60cc0187339447bc514b4593490b58b8c66fb98def06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-german"

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
