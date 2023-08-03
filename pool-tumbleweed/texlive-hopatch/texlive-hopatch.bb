SUMMARY = "Load patches for packages"
DESCRIPTION = "Hopatch provides a command with which the user may register of \
patch code for a particular package. Hopatch will apply the \
patch immediately, if the relevant package has already been \
loaded; otherwise it will store the patch until the package \
appears."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn65491"

RPM_NAME = "texlive-hopatch-2023.209.1.5svn65491-54.1.noarch.rpm"
RPM_HASH = "a3c80e28e84522f17295b3596a2f00c1588bebe8bc37061e75ee1d9236386bff67a544e02a79bc96336123d41a6e4ab5f4ad76109e47c3e064e6fcb471e90ca8"
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
