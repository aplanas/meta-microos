SUMMARY = "Industrial I/O library -- iiod"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains a udev rule for granting access to IIO targets \
using the USB transport/backend."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio-usb-udev-rules-0.24-1.5.aarch64.rpm"
RPM_HASH = "d0e76e5d0e64ef769200931b772337f3cc58c11f26dcdedbcf9ca421acff16e72f5e16ff8d9587e6666b6df805d6bdf52c67c8a41b6f2b3dc1aa1f87a4a1048b"

RPROVIDES:${PN} += "libiio-usb-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
