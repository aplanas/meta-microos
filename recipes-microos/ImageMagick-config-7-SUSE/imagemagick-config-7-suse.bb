SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as provide by SUSE. It is more security \
aware than config-upstream variant. It does disable some coders, \
that are insecure by design to prevent user to use them \
inadvertently. Configuration can be subject of change by future \
version and maintenance updates and system changes will not be \
preserved."
LICENSE = "ImageMagick"

PV = "7.1.1.8"

RPM_NAME = "ImageMagick-config-7-SUSE-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "2e71c1cd39d854d29b0c4906a1b4da606d9e15491937145f6d3114bd36968c3018528809fcc6571f7d9d459869630ecb81c34dc72457d40f31eb5635d432fee3"

RPROVIDES:${PN} += "ImageMagick-config-7-SUSE ImageMagick-config-7-SUSE(aarch-64) config(ImageMagick-config-7-SUSE) imagick-config-7"
RDEPENDS:${PN} += "/bin/sh update-alternatives"

inherit rpm
