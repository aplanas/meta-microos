SUMMARY = "A short document about TeX principles"
DESCRIPTION = "This document is meant for users who are looking for \
information about the basics of TeX. Its main goal is its \
brevity. The pure TeX features are described, no features \
provided by macro extensions. Only the last section gives a \
summary of plain TeX macros."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.8svn63336"

RPM_NAME = "texlive-tex-nutshell-2023.201.0.0.8svn63336-54.1.noarch.rpm"
RPM_HASH = "0a4c4afe4be6c428f014192a487b71f1bc63bef1b3f9eda3162da27b26e4d5595d934868a5a9ce52d195773487d4e27cf63af85c629dd5e028450bbcbe6824da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-nutshell"

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
