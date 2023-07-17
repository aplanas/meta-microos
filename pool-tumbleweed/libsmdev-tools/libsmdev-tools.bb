SUMMARY = "Utilities for reading storage media devices through libsmdev"
DESCRIPTION = "This subpackage contains the utility programs from libsmdev, which \
can access and read storage media devices and will determine \
information about such."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-tools-20221028-2.12.aarch64.rpm"
RPM_HASH = "ccb619b04d87d41ec8c2bec092276413c0691be2085bda64c3a42aabe266d98762fecab30767f31ebe2a7e4101fe034f0667ad9f7b3e281ad49716405b6dfe78"

RPROVIDES:${PN} += "libsmdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsmdev.so.1"

inherit rpm
