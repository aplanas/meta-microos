SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.6.5"

RPM_NAME = "fde-firstboot-0.6.5-2.1.aarch64.rpm"
RPM_HASH = "11c61d88e71e982e1f623e6115c0f38fb13e491d8ed7fac271e69c64e61837b33c67e9ed2f8e9badf1f5ab32e788def2c913f1e9c93209fedcce3f436985d3db"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
