SUMMARY = "Multi-column enumerated lists"
DESCRIPTION = "Defines an environment multienumerate, that produces an \
enumerated array in which columns are vertically aligned on the \
counter. The motivation was lists of answers for a text book, \
where there are many rather small items; the multienumerate \
environment goes some way to making such lists look neater."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21775"

RPM_NAME = "texlive-multenum-2023.209.svn21775-55.1.noarch.rpm"
RPM_HASH = "dee93b42c97a2afaf3f6611ff5f1953c0d9372c4ae21fe9370dceb375fdb8000e3da46597cca4780ae8238d76806d746e94b65a945b8388b687c4e94dd7e2f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multienum.sty \
texlive-multenum"

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
