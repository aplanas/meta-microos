SUMMARY = "Extend LaTeX's cross-reference system"
DESCRIPTION = "This package extends the cross-reference system of LaTeX2e and \
introduces concepts of namespace and scope. It also allows \
users to customize reference formats. The package is part of \
the WT Series. Prerequisite packages: xparse and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-2023.209.0.0.4.0svn55558-53.2.noarch.rpm"
RPM_HASH = "87ab1ee36adb912d7ca996faa3020dabfea03b20060d595d584aa3fb77d59999737b5034d350e17f29d6ebcec702461b6b54514099dae8104fb714f37726dd0a"
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
