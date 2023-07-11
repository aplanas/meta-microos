SUMMARY = "Local allocation macros for LaTeX 2015"
DESCRIPTION = "Local allocation macros, with names taken from etex.sty but \
with implementation based on the LaTeX 2015 allocation macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-2023.201.0.0.03svn42712-53.2.noarch.rpm"
RPM_HASH = "0f80f4d757c1cb5f3e88adb307c25846a5cf37150566d554d62f333faadfee980b32f9396abef0ab4cba2f386fd20950f8dbe59a6bd5acbb15056087f62e7c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elocalloc.sty \
texlive-elocalloc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
