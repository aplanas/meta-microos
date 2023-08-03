SUMMARY = "A short document about TeX principles"
DESCRIPTION = "This document is meant for users who are looking for \
information about the basics of TeX. Its main goal is its \
brevity. The pure TeX features are described, no features \
provided by macro extensions. Only the last section gives a \
summary of plain TeX macros."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.8svn63336"

RPM_NAME = "texlive-tex-nutshell-2023.209.0.0.8svn63336-55.1.noarch.rpm"
RPM_HASH = "72ee62a2566582641c3a374baca8deaadc31366b3cd90f6f293e9b44fc2c6391704f048033093a3eb7144a71e90b6f54f530515f49736a9f7cfb410c83752d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-nutshell"

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
