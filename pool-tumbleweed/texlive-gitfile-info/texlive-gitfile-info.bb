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

PV = "2023.209.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-2023.209.0.0.5svn51928-54.1.noarch.rpm"
RPM_HASH = "e0728ea21ca3df74d4a1b3bb1af3891ea7bebde5b25f7021059101dcad7c9bedb545f36031f99e5d6953af07f1e8ec19339ccb897ede2abe462b0515bb5d491f"
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
