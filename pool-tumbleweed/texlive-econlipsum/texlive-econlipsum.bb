SUMMARY = "Generate sentences from economic articles"
DESCRIPTION = "This package is a blind text generator that ouputs sentences \
inferred from abstracts of economic articles. All the \
paragraphs are taken with permission from \
https://ipsum.mwt.me/."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-2023.209.0.0.8.2svn58390-54.2.noarch.rpm"
RPM_HASH = "4dd937aaffaa66bf02cf7c3f6fa1bf8180141899f199a5d467152a6ae0dcb4cb13b9287129c22398a83dc82b7b020178d66ea0dba78596f6beb1fabb13b353ac"
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
