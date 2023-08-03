SUMMARY = "Kluwer publication support"
DESCRIPTION = "Most likely long obsolete, unfortunately."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-kluwer-2023.209.svn54074-56.1.noarch.rpm"
RPM_HASH = "ab7c79bd2d3730a6d2a33bb333aa025b9de7008457e7bbe128897395a3f7bb9b64d59c42d7d502d7fab11d44d4113aa832469a5fb0f188120320ee0c25498c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-klu10.clo \
tex-klu105.clo \
tex-klu11.clo \
tex-klu12.clo \
tex-klu9.clo \
tex-klucite.sty \
tex-kluedit.sty \
tex-klufloa.sty \
tex-klulist.sty \
tex-klumac.sty \
tex-klumath.sty \
tex-klumono.sty \
tex-klunote.sty \
tex-kluopen.sty \
tex-klups.sty \
tex-kluref.sty \
tex-klusec.sty \
tex-klut10.clo \
tex-klut11.clo \
tex-klut12.clo \
tex-klut9.clo \
tex-klutab.sty \
tex-kluwer.cls \
texlive-kluwer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-doc.sty \
tex-fontenc.sty \
tex-mathptm.sty \
tex-textcomp.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
