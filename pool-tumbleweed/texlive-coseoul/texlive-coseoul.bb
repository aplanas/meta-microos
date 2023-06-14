SUMMARY = "Context sensitive outline elements"
DESCRIPTION = "The package provides 'relative' commands that may be used in \
place of \\chapter, \\section, etc. The documentation shows a \
number of document-management scenarios in which such commands \
are valuable."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn23862"

RPM_NAME = "texlive-coseoul-2023.204.1.1svn23862-54.1.noarch.rpm"
RPM_HASH = "7322f2d40b7c0c684c977de86c3f36ea88fe465b392434b4a6c4b16ce5f39ae6330fd1eb82cb24a9cbe421ff72568fd23595d613d9d8829277debfe4c3b202b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coseoul.sty \
texlive-coseoul"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
