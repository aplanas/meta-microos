SUMMARY = "Local allocation macros for LaTeX 2015"
DESCRIPTION = "Local allocation macros, with names taken from etex.sty but \
with implementation based on the LaTeX 2015 allocation macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-2023.209.0.0.03svn42712-54.1.noarch.rpm"
RPM_HASH = "b4a77b297510bfec21534b1573646ace231e755ce8bd9e8ed96d880cd1538c459294594afb49ae0dafcceaa277b744a04d5c373d58862fb62e2fedbdc876f389"
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
