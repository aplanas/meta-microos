SUMMARY = "Severed fonts for texlive-staves"
DESCRIPTION = "The  separated fonts package for texlive-staves"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-staves-fonts-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "19fef8d5cd88f9267f8ba58bcf9bc1e650467291e9edcd764a13abf9a4dede3de938186ca8c35fe08921cd9008cded5f08586349d94bfdd71763b4000602fb34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-icelandic \
texlive-staves-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
