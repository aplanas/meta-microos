SUMMARY = "Access basic ligatures in legacy TrueType fonts"
DESCRIPTION = "This small and simple package allows LuaLaTeX users to access \
basic ligatures (ff, fi, ffi, fl, ffl) in legacy TrueType fonts \
(those lacking a liga table) accessed via fontspec."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn50912"

RPM_NAME = "texlive-addliga-2023.201.1.0svn50912-54.1.noarch.rpm"
RPM_HASH = "fc1f45e3c8948e28a201f5287356b8f057def0371a4f36ec17010fcd81e6e060a6cf5bc977b9001ca33af7f18b85dbac9a320984d7cc92dd6f0c99f3576a218c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(addliga.sty) \
texlive-addliga"

RDEPENDS:${PN} += "/bin/sh \
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
