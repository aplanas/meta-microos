SUMMARY = "Ukrainian version of the LaTeX introduction"
DESCRIPTION = "Ukrainian version of A Short Introduction to LaTeX2e."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.00svn55643"

RPM_NAME = "texlive-lshort-ukr-2023.201.4.00svn55643-52.1.noarch.rpm"
RPM_HASH = "29b7c7edc8435c632bd2a23039704a55d70e2b39e1d24e70a325426ba872bf0e9bee29d7c853a75094b3bca304950a19796c38884addb5c26a48e00469726a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-ukr"

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
