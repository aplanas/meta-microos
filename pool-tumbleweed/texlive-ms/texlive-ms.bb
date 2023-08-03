SUMMARY = "Various LaTeX packages by Martin Schroder"
DESCRIPTION = "The remains of a bundle of LaTeX packages by Martin Schroder; \
the collection still comprises: count1to, make use of TeX \
counters; and multitoc, typeset the table of contents in \
multiple columns. ragged2e, prelim2e, everyshi (obsolete), and \
everysel (obsolete), which used to be part of this bundle, have \
become independent packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57473"

RPM_NAME = "texlive-ms-2023.209.svn57473-55.1.noarch.rpm"
RPM_HASH = "d25f23ac66048399b0390f3a70d12eb3451807dc75b09ff20e154360841a4f824cb627ea7772206dd2866a927d456f907d0bb405210291a1487a5848f9186d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-count1to.sty \
tex-multitoc.sty \
texlive-ms"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-ifthen.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
