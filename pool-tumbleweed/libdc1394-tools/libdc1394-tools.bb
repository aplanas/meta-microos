SUMMARY = "Command-line utilities from libdc1394"
DESCRIPTION = "This subpackage contains a 1394 bus reset utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-tools-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "901b9feb602d0037d2f16b837024c05c4ba3c0eef8748bfcf2ccbbad5dc232fc7ef92075343ac11dfb012823578fdc78a6eca50422edd278ba3981a81d41bd92"

RPROVIDES:${PN} += "libdc1394 \
libdc1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdc1394.so.26"

inherit rpm
