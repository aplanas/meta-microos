SUMMARY = "Draw histograms with the LaTeX picture environment"
DESCRIPTION = "This is a collection pf macros to draw histogram bars inside a \
LaTeX picture-environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-histogr-2023.209.1.01svn15878-54.1.noarch.rpm"
RPM_HASH = "1ffc727846171ba31efdbc6ff6f2f119c8509b461da188cd2be6c7c5e0c62493e94325dc421bbd29f1ce11533484b07f365c921e31188999334e79f3a0663820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-histogr.sty \
texlive-histogr"

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
