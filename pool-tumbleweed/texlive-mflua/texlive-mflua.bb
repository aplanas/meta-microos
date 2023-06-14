SUMMARY = "Configuration and base files for MFLua"
DESCRIPTION = "For information on this Lua-enabled Metafont, see, for example: \
tug.org/TUGboat/tb32-2/tb101scarso.pdf."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62774"

RPM_NAME = "texlive-mflua-2023.201.svn62774-54.1.noarch.rpm"
RPM_HASH = "75741400bdff716c82e122f328351defe2d86f3ce875529748979f8a181f1c34fddff670e7d91f1a2d64ca892fc5b200d2169756082da3e5414553f365b11a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflua"

RDEPENDS:${PN} += "/bin/sh \
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
