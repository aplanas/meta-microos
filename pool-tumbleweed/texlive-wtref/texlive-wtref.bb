SUMMARY = "Extend LaTeX's cross-reference system"
DESCRIPTION = "This package extends the cross-reference system of LaTeX2e and \
introduces concepts of namespace and scope. It also allows \
users to customize reference formats. The package is part of \
the WT Series. Prerequisite packages: xparse and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-2023.209.0.0.4.0svn55558-53.1.noarch.rpm"
RPM_HASH = "363a26234a0d02f87254bb6b861736aa18d0bae77cf3629707d9e48943a421022df67f18694b22dbf5220105e905385fc37d1dccc76ebf55b6a06991928629da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wtref.sty \
texlive-wtref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
