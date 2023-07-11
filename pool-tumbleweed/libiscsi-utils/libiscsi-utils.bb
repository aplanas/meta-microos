SUMMARY = "Some utilities for libiscsi"
DESCRIPTION = "libiscsi is a clientside library to implement the iSCSI protocol that can \
be used to access resource of an iSCSI target. \
 \
This package contains utilities based on libiscsi."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-utils-1.19.0+git.20230208-1.4.aarch64.rpm"
RPM_HASH = "a178cc78d5fdba9242af17c9c677b3fc119d94430da2c49b82eefa1cad1858ef4ba8dff4f32015d3c04c9423777310a938738d227dc9b59a60d60d755196f805"

RPROVIDES:${PN} += "libiscsi-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiscsi.so.9"

inherit rpm
