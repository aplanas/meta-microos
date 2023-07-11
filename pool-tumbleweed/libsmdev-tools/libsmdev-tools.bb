SUMMARY = "Utilities for reading storage media devices through libsmdev"
DESCRIPTION = "This subpackage contains the utility programs from libsmdev, which \
can access and read storage media devices and will determine \
information about such."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "libsmdev-tools-20221028-2.11.aarch64.rpm"
RPM_HASH = "6001c200f16e27c385eedef41b6072a09a212ae591df7b4b83a1d2c5ac62029ff6125509aeda93937f77142c3f643b6d7ceac160819702ae2f1a4ff3bda5aac0"

RPROVIDES:${PN} += "libsmdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libsmdev.so.1"

inherit rpm
