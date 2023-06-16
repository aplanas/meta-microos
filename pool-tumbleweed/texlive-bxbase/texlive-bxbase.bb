SUMMARY = "BX bundle base components"
DESCRIPTION = "The main purpose of this bundle is to serve as an underlying \
library for other packages created by the same author (their \
names start with 'BX' or 'PX'). However bxbase package contains \
a few user-level commands and is of some use by itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn66115"

RPM_NAME = "texlive-bxbase-2023.201.1.2asvn66115-52.1.noarch.rpm"
RPM_HASH = "345afb9485c55a884690f16ef5e903b927569c58d77653d20e4f46c0a6f65e664d25aeaef4b935620bcb629f70e54ea4ad5aeb081dcafe773c9c93ce5872bf02"
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
