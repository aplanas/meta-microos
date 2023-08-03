SUMMARY = "Severed fonts for texlive-dad"
DESCRIPTION = "The  separated fonts package for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54191"

RPM_NAME = "texlive-dad-fonts-2023.209.1.2svn54191-55.1.noarch.rpm"
RPM_HASH = "2e1c7a70f1a66a16c44569f2fcd894646c65ec0e1accd68c69ccd668aaac0ea714a145fbb25fe4b8b5dab61b7eac9c130af86a00349693c42fe828a0897c3b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=ar \
font-dad \
texlive-dad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
