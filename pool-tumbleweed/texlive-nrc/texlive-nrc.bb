SUMMARY = "Class for the NRC technical journals"
DESCRIPTION = "Macros, and some documentation, for typesetting papers for \
submission to journals published by the National Research \
Council Research Press. At present, only nrc2.cls (for \
two-column layout) should be used."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01asvn29027"

RPM_NAME = "texlive-nrc-2023.209.2.01asvn29027-55.1.noarch.rpm"
RPM_HASH = "39ae603a320d1277f8d08016d84d6375e2d9b4a0156513c74fb951fea0655fa67390cc0cc1558330623db3170fcfbeb540894803d6e8245aadfe5842be7583f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nrc1.cls \
tex-nrc1.sty \
tex-nrc2.cls \
tex-nrc2.sty \
texlive-nrc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fontenc.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
