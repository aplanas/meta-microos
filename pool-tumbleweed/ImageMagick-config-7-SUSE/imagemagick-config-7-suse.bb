SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as provide by SUSE. It is more security \
aware than config-upstream variant. It does disable some coders, \
that are insecure by design to prevent user to use them \
inadvertently. Configuration can be subject of change by future \
version and maintenance updates and system changes will not be \
preserved."
LICENSE = "ImageMagick"

PV = "7.1.1.15"

RPM_NAME = "ImageMagick-config-7-SUSE-7.1.1.15-1.1.aarch64.rpm"
RPM_HASH = "b237e65b835c913241c887556d47bdeb097e096efd1e59a0e9568f46eac27fb8831adb87fdb3d26cfffcfe8a964f6c42b156258ad3db9cba5d02be78a329de20"

RPROVIDES:${PN} += "ImageMagick-config-7-SUSE \
config-ImageMagick-config-7-SUSE \
imagick-config-7"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
