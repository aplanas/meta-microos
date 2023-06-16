SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as provide by SUSE. It is more security \
aware than config-upstream variant. It does disable some coders, \
that are insecure by design to prevent user to use them \
inadvertently. Configuration can be subject of change by future \
version and maintenance updates and system changes will not be \
preserved."
LICENSE = "ImageMagick"

PV = "7.1.1.11"

RPM_NAME = "ImageMagick-config-7-SUSE-7.1.1.11-1.1.aarch64.rpm"
RPM_HASH = "26e65b3e524feb98eddf58ffc8230af6b33bb097d0820f462d5546f1f5fe4feff196ccda382f3e96e8ed393bee915283c3881c84b81afee9dc0992aa9fdf5167"

RPROVIDES:${PN} += "ImageMagick-config-7-SUSE \
config-ImageMagick-config-7-SUSE \
imagick-config-7"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
