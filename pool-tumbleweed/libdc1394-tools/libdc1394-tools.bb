SUMMARY = "Command-line utilities from libdc1394"
DESCRIPTION = "This subpackage contains a 1394 bus reset utility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.6"

RPM_NAME = "libdc1394-tools-2.2.6-3.13.aarch64.rpm"
RPM_HASH = "e4bf5fd15a8000e12a3d51cd6fe85ed6051fecd1acef05693800d9c8f62825925891483312a3fecad3e909635e7b667744299cd343630dc8287d09516bd7280b"

RPROVIDES:${PN} += "libdc1394 \
libdc1394-tools \
libdc1394-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdc1394.so.25()(64bit)"

inherit rpm
