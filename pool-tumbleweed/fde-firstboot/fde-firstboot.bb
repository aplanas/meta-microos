SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.6.8"

RPM_NAME = "fde-firstboot-0.6.8-1.1.aarch64.rpm"
RPM_HASH = "a18189de49e4f11ac48721db402270fc13a86c4dce3e8c13dcaa95e86b93ef57b4cc9f6b66e6fc2d20025ebeb9bfb5b56ce2468c1a2bbf16f25ecf3c18896c05"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
