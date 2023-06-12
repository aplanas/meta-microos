SUMMARY = "Commands for typesetting total values of counters"
DESCRIPTION = "This LaTeX package offers commands for typesetting total values \
of counters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn56214"

RPM_NAME = "texlive-totalcount-2023.201.1.0asvn56214-52.1.noarch.rpm"
RPM_HASH = "6c62b85a1359bf48c69279efdef9ed7407b16210878fab912faf225bf7ee9646c319aa21ac8c205a93371a99bebd07137337100b84fcbee09c274b62fcc2eff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(totalcount.sty) \
texlive-totalcount"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
