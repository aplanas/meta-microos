SUMMARY = "Macros for making newsletters with Plain TeX"
DESCRIPTION = "The newsletr package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-newsletr-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "153c3d7bb72962efafdfd9da7afec5b93ae465fdd52d290b7b669bb7ae86832909a8375c30aa91780c2c2889c8c17c311a72e33f03f90cee9f3a429f1fd87c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newsletr.tex \
texlive-newsletr"

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
