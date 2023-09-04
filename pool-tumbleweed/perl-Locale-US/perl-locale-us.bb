SUMMARY = "Two letter codes for state identification in the United States and vice versa"
DESCRIPTION = "Two letter codes for state identification in the United States and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.04"

RPM_NAME = "perl-Locale-US-3.04-1.28.noarch.rpm"
RPM_HASH = "537c9fb48aae59854b33f24350d6ee62648dedf9b7abc4e56a427d86e93d1d72d0946529a74a5d692a6a7855d16c6fac48101b7281bccb25abf111d23ba14877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--US \
perl-Locale-US"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Section--Simple"

inherit rpm
