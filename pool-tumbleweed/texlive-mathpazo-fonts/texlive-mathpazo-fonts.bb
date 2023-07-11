SUMMARY = "Severed fonts for texlive-mathpazo"
DESCRIPTION = "The  separated fonts package for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.003svn52663"

RPM_NAME = "texlive-mathpazo-fonts-2023.208.1.003svn52663-53.1.noarch.rpm"
RPM_HASH = "675291674959a082b2499372f9d4196cf58d63ff3cf7978e70b3a5b2ba6704ccb5391c40fba45d10d9bb1b269928f9b10efebb5521f39dff49ce7f00231aa298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pazomath \
font-pazomathblackboardbold \
texlive-mathpazo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
