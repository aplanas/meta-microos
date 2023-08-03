SUMMARY = "Severed fonts for texlive-gfssolomos"
DESCRIPTION = "The  separated fonts package for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-fonts-2023.209.1.0svn18651-53.1.noarch.rpm"
RPM_HASH = "37c94e8b076db3fa979a2795414104a805efef8614b8e08edfc32fcb1b37b3b893266414811a1bd3b661db94174a1df9f035974e915d9adc9b412bb3366bee75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfssolomos-fonts \
font--lang=el \
font-gfssolomos \
texlive-gfssolomos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
