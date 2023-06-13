SUMMARY = "Quickly define several similar macros"
DESCRIPTION = "Multidef provides a simple way of defining several macros \
having similar definitions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn40637"

RPM_NAME = "texlive-multidef-2023.201.1.10svn40637-54.1.noarch.rpm"
RPM_HASH = "c703f0083154086aa8d002b9fa0260ff5bb0bb13af4e7cb66839b374d337147e1693c873caa369f38e09d422a19ef9ce6ecfb314c4e1e768f2fd20dcd43aec95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multidef.sty) \
texlive-multidef"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(trimspaces.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
