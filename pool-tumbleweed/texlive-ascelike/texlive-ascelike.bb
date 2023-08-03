SUMMARY = "Bibliography style for the ASCE"
DESCRIPTION = "A document class and bibliographic style that prepares \
documents in the style required by the American Society of \
Civil Engineers (ASCE). These are unofficial files, not \
sanctioned by that organization, and the files specifically \
give this caveat. Also included is a short \
documentation/example of how to use the class."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn29129"

RPM_NAME = "texlive-ascelike-2023.209.2.3svn29129-54.1.noarch.rpm"
RPM_HASH = "d57c96f736697110cebb34cb2577172fa11347f10d7aec83130cdde7baf645a7813c744d4adedda92b314deaf85775e4344350ef91f94689fd04ade42cb066e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascelike.cls \
texlive-ascelike"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-endfloat.sty \
tex-ifthen.sty \
tex-lineno.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
