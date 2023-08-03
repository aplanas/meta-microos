SUMMARY = "Typeset Karnaugh-Veitch-maps"
DESCRIPTION = "The package provides macros for typesetting Karnaugh-Maps and \
Veitch-Charts in a simple and user-friendly way. Karnaugh-Maps \
and Veitch-Charts are used to display and simplify logic \
functions 'manually'. These macros can typeset Karnaugh-Maps \
and Veitch-Charts with up to ten variables (=1024 entries)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21338"

RPM_NAME = "texlive-karnaugh-2023.209.svn21338-56.1.noarch.rpm"
RPM_HASH = "066521f1ec8b41ccf9ab982418cfb010f98e91d8f2653f313e78c8e6e39a3194a09dd320e057cb86e116984e3ad6ece618f4e43661a185590c1c4d7b0f0f5247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvmacros.tex \
texlive-karnaugh"

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
