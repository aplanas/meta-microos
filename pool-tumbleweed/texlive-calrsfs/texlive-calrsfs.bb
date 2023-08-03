SUMMARY = "Copperplate calligraphic letters in LaTeX"
DESCRIPTION = "Provides a maths interface to the rsfs fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17125"

RPM_NAME = "texlive-calrsfs-2023.209.svn17125-53.1.noarch.rpm"
RPM_HASH = "c95cdd79b9bdc446ab4b3b0b7280cf5e5b6a11c767b45352d75e10a351f9253737dd0f728b912478cbb78b866484512975ca2bbb3db1b6268793697413f3f44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OMSrsfs.fd \
tex-calrsfs.sty \
texlive-calrsfs"

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
