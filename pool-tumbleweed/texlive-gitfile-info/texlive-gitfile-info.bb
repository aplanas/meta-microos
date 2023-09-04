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

RPM_NAME = "texlive-gitfile-info-2023.209.0.0.5svn51928-54.2.noarch.rpm"
RPM_HASH = "0c76656b7758a09bc8ea164dce3ad6006fc90d59aefedd085cee09fa11f229c2da110bfe5424ebea16afd6d7b63b7cad52f205df5e31bb3aeab12705d00e664f"
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
