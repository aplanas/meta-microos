SUMMARY = "Access basic ligatures in legacy TrueType fonts"
DESCRIPTION = "This small and simple package allows LuaLaTeX users to access \
basic ligatures (ff, fi, ffi, fl, ffl) in legacy TrueType fonts \
(those lacking a liga table) accessed via fontspec."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn50912"

RPM_NAME = "texlive-addliga-2023.209.1.0svn50912-55.1.noarch.rpm"
RPM_HASH = "aae9d6f0950b84dfea8fe77b02b25269ca1d4cb8344cc6705ad00b2b3a9d16725946a7aa5a7dba2935bdc338a09ba842bce3e00b708c37bc1639b7565b60778f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-addliga.sty \
texlive-addliga"

RDEPENDS:${PN} += "/usr/bin/sh \
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
