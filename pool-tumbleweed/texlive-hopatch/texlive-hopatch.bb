SUMMARY = "Load patches for packages"
DESCRIPTION = "Hopatch provides a command with which the user may register of \
patch code for a particular package. Hopatch will apply the \
patch immediately, if the relevant package has already been \
loaded; otherwise it will store the patch until the package \
appears."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65491"

RPM_NAME = "texlive-hopatch-2023.209.1.5svn65491-54.2.noarch.rpm"
RPM_HASH = "28487789900a8c67d8e9c36a8f53b126544daec843107802304e64e22b6669c90cd746b587ec241ab2d60ff97dda2cd3a71a1f9f7b8bcf9c9c4d6cbf27bd3262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hopatch-2016-05-16.sty \
tex-hopatch.sty \
texlive-hopatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
