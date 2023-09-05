SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.6.9"

RPM_NAME = "fde-firstboot-0.6.9-1.1.aarch64.rpm"
RPM_HASH = "170b43778da6e68987bdf72293b8fab01d483d43657db96c944a5277c5ffd1568c6d580b17fbd0246a6e66c136ad48e8b0c3a557e98484041ce3684c6ce90182"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
