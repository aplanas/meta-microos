SUMMARY = "Configuration and base files for MFLua"
DESCRIPTION = "For information on this Lua-enabled Metafont, see, for example: \
tug.org/TUGboat/tb32-2/tb101scarso.pdf."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62774"

RPM_NAME = "texlive-mflua-2023.209.svn62774-55.1.noarch.rpm"
RPM_HASH = "32aaa7a679b6cc8038d1bb67295e24d270e7b8b5119804d556499ce1e2c7229b851a7267f66a9ffcc96ecbbfcb77b800efc3baae32c38b49486c4c50e34854aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatex \
texlive-metafont \
texlive-mflua-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
