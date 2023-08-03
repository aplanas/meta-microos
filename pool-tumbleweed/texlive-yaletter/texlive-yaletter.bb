SUMMARY = "Extremely flexible macros for letters, envelopes, and label sheets"
DESCRIPTION = "The yaletter class provides extremely configurable macros for \
typesetting letters in any conceivable style. It provides \
facilities for maintaining easily-accessible databases of \
letterheads and addresses for repeat use. It further provides \
easy macros for envelopes and for label sheets. Finally, it \
provides some nice defaults for a few of the more common styles \
and sizes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42830"

RPM_NAME = "texlive-yaletter-2023.209.1.1svn42830-53.1.noarch.rpm"
RPM_HASH = "01ede9d4a0f6f709ab919ecad566de7c90296c0a806ea4662e1cffa98a875bb03d6115b3b4b65df2de6624d9111189ddbf97cad34549b0b1aafcd53e24b0de1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yaletter.cls \
texlive-yaletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-textpos.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
