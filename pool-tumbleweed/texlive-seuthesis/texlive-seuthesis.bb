SUMMARY = "LaTeX template for theses at Southeastern University"
DESCRIPTION = "This template is for theses at Southeastern University, \
Nanjing, China."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-2023.209.2.1.2svn33042-54.1.noarch.rpm"
RPM_HASH = "2ea1a9d61dfcbb61e6641d28abd53d4510429b7d2bdf33f6e031938c32045b69fdb9ce480eaf96f5f99964d37ab95e59801263526214ad80fd5d672e6aca9f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seuthesis"

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
