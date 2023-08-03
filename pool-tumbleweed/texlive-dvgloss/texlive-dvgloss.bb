SUMMARY = "Facilities for setting interlinear glossed text"
DESCRIPTION = "The package provides extensible macros for setting interlinear \
glossed text -- useful, for instance, for typing linguistics \
papers. The operative word here is 'extensible': few features \
are built in, but some flexible and powerful facilities are \
included for adding your own."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-2023.209.0.0.1svn29103-54.1.noarch.rpm"
RPM_HASH = "4f666f43c4fab1c740dcfa62245c84d2076af3c97c96aef0c0aae0b85e2dc8cf0f0e6618731223674ed578cd098e2af561559ef937f5112a336a7a2e319d9790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvgloss.sty \
texlive-dvgloss"

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
