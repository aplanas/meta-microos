SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as provide by SUSE. It is more security \
aware than config-upstream variant. It does disable some coders, \
that are insecure by design to prevent user to use them \
inadvertently. Configuration can be subject of change by future \
version and maintenance updates and system changes will not be \
preserved."
LICENSE = "ImageMagick"

PV = "7.1.1.12"

RPM_NAME = "ImageMagick-config-7-SUSE-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "d6072c7f8b7489a2d324f82ae9d3775bff4f0b922d6358bb9462a00226256e6ebaa4988ede0d3935c23639a1695cd18e0c392cdb480516cd8b88bea551cbc1cc"

RPROVIDES:${PN} += "ImageMagick-config-7-SUSE \
config-ImageMagick-config-7-SUSE \
imagick-config-7"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
