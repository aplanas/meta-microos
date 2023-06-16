SUMMARY = "Conditionals to test which platform is being used"
DESCRIPTION = "This package uses the (La)TeX extension -shell-escape to \
establish whether the document is being processed on a Windows \
or on a Unix-like system (Mac OS X, Linux, etc.), or on Cygwin \
(Unix environment over a windows system). Booleans provided \
are: \\ifwindows, \\iflinux, \\ifmacosx and \\ifcygwin. The package \
also preserves the output of uname on a Unix-like system, which \
may be used to distinguish between various classes of Unix \
systems."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-2023.201.0.0.4asvn45533-52.1.noarch.rpm"
RPM_HASH = "3511b987b01854e1dae65fb6be79677de2bd937afac17fde8682feaedfa1ed5fcaf651b78c69c57cb819e8c5901d26dbdb7a321968fc2ba91daa7c6f022f13b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifplatform.sty \
texlive-ifplatform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-ifluatex.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
