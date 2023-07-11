SUMMARY = "Generate sentences from economic articles"
DESCRIPTION = "This package is a blind text generator that ouputs sentences \
inferred from abstracts of economic articles. All the \
paragraphs are taken with permission from \
https://ipsum.mwt.me/."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-2023.201.0.0.8.2svn58390-53.2.noarch.rpm"
RPM_HASH = "a723eb6d4e056cf1666e119767d8309a67f55c94be0cd3ca359aa9ba73790a463afad95307c984783373cffd10ff9123f43194b2cec9239229a47ea874ed8281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-econlipsum.sty \
texlive-econlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
