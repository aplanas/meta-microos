SUMMARY = "Enhanced display of LaTeX File Information"
DESCRIPTION = "The bundle provides two packages, readprov and myfilist. The \
readprov package provides a means of reading file information \
without loading the body of the file. The myfilist package uses \
readprov and controls what \\listfiles will report."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-2023.209.0.0.81asvn28421-53.1.noarch.rpm"
RPM_HASH = "393c5eaa3515437169ff597df9ad1ab643687b2e5c2b94e3265c5d1a6c53853a2d80f2ae16e4e2f651250698b14b43e4493b0bbe6d0761d2c4b0ab1575237a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-myfilist.sty \
tex-readprov.sty \
texlive-fileinfo"

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
