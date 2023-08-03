SUMMARY = "Full Disk Encryption for images"
DESCRIPTION = "This package contains the scripts necessary to plug Full Disk Encryption \
into the JeOS Firstboot framework used for image based delivery of ALP."
LICENSE = "GPL-2.0-only"

PV = "0.6.6"

RPM_NAME = "fde-firstboot-0.6.6-2.1.aarch64.rpm"
RPM_HASH = "288452b5a46436b672d27f30c6c864d435837b33fc92ad8135ad6be1d1b4ff8bd56935fa5aba7e1c29fff22973f6d8bfd2f8c694db9198981020efc7186e1a50"

RPROVIDES:${PN} += "fde-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
fde-tools \
jeos-firstboot"

inherit rpm
