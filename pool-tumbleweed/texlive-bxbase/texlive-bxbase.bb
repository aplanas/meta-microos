SUMMARY = "BX bundle base components"
DESCRIPTION = "The main purpose of this bundle is to serve as an underlying \
library for other packages created by the same author (their \
names start with 'BX' or 'PX'). However bxbase package contains \
a few user-level commands and is of some use by itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn66115"

RPM_NAME = "texlive-bxbase-2023.209.1.2asvn66115-53.1.noarch.rpm"
RPM_HASH = "79fbea45d02a64e3beda3c62284af067ce73e66804bf2131bcb2f17e12e5fd39b3fb600cd365214b6dd5804ae52c15308984e3b348b1adad3cf9bc04c8293258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxbase.def \
tex-bxbase.sty \
tex-bxtoolbox-ext.def \
tex-bxtoolbox-ja.def \
tex-bxtoolbox.def \
tex-bxtoolbox.sty \
tex-bxutf8.def \
tex-bxutf8x.def \
tex-zxbase.sty \
texlive-bxbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
