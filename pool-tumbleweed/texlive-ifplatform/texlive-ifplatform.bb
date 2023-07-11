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

PV = "2023.208.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-2023.208.0.0.4asvn45533-53.1.noarch.rpm"
RPM_HASH = "33283135a2a7f274ff9198d8931281818da4583a97ae891e8905bbd866df2a8805c056a1aa20c9b71a7a6d102e4806e4cfb4b61a4f6a7379728d0fa6b2d4e187"
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
