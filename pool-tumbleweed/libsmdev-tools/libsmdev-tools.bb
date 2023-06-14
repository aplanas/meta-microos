SUMMARY = "Utilities for reading storage media devices through libsmdev"
DESCRIPTION = "This subpackage contains the utility programs from libsmdev, which \
can access and read storage media devices and will determine \
information about such."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-tools-20221028-2.8.aarch64.rpm"
RPM_HASH = "12ae5027a2e4544f48ee18d68ecf45b3af920ed5eac8cfaddb1a5322c6d63733075170671e1b69f889badbbc925762469a78e7b9e2bfa8f4f790dfa42126e9b9"

RPROVIDES:${PN} += "libsmdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsmdev.so.1"

inherit rpm
