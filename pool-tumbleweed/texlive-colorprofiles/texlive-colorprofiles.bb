SUMMARY = "Collection of free ICC profiles"
DESCRIPTION = "This package collects free ICC profiles that can be used by \
color profile aware applications/tools like the pdfx package, \
as well as TeX and LaTeX packages to access them."
LICENSE = "LPPL-1.0"

PV = "2023.209.20181105svn49086"

RPM_NAME = "texlive-colorprofiles-2023.209.20181105svn49086-54.1.noarch.rpm"
RPM_HASH = "dd0cf1d67fe7e06a9a187b5b8dcb77cdf9f67899e160ae7fcb0cae41edf89a5f3f1618dfadd4efadd93caa1cc09ada8911bc5647ac8be7c681b9b828c732da20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorprofiles.sty \
tex-colorprofiles.tex \
texlive-colorprofiles"

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
