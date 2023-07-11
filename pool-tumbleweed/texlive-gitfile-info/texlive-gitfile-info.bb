SUMMARY = "Get git metadata for a specific file"
DESCRIPTION = "If you are using git to control versions of LaTeX-files, you \
may want to show yourself or other users or devs the current \
version of the file, information about the author and last \
edited date. All packages for git known make that kind of \
information available for the whole repository. But sometimes \
you have a lot of files within the same repository in different \
versions, from different authors etc. Perhaps you also split up \
a big project in small files and want to show within the \
document who had edited what. This package gives you the \
opportunity to do so."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-2023.201.0.0.5svn51928-53.2.noarch.rpm"
RPM_HASH = "1dcc975b9d3b73d958a2587e52794cc9c98cbab1822e57041f853df9d50231df46b5a32014813ff5a64714319db8d5026be0b3aa9a5a106176218e6cbc97e443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitfile-info.sty \
texlive-gitfile-info"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-tcolorbox.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
