SUMMARY = "Utility programs for use with TeX"
DESCRIPTION = "Basic utitility programs, comprising: dvitype, which converts a \
TeX output (DVI) file to a plain text file (see also the DVI \
Text Language suite); pooltype, which converts a TeX-suite \
program's 'pool' (string) file into human-readable form; and \
tftopl and pltotf, which convert TeX Font Metric (TFM) file to \
human readable Property List (PL) files and vice versa."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-texware-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "18b3d0af26148e53a606e2d65b891fbe04d01db3156f056e27f4714c521b4b76830c7bae08e76c090b24b188ceb779733413bd0eabf51d7833339f161230586c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvitype.1 \
man-pooltype.1 \
texlive-texware"

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
texlive-scripts-bin \
texlive-texware-bin"

inherit rpm
