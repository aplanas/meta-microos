SUMMARY = "Support for users in Telecommunications Engineering"
DESCRIPTION = "The package provides a wide range of abbreviations for terms \
used in Telecommunications Engineering."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn28571"

RPM_NAME = "texlive-engtlc-2023.209.3.2svn28571-54.2.noarch.rpm"
RPM_HASH = "7248454f98f47f01b1d2f2e48da956698e70e3c34332edebd620965e8801d2ce88f1cc9b1f93ab4973c2422ddc997c459976ca2977144393f4c8b9e644c346d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engtlc.sty \
texlive-engtlc"

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
