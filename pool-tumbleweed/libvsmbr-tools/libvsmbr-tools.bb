SUMMARY = "Utilities for inspecting MS-DOS partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsmbr to \
inspect MS-DOS partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-tools-20210509-4.9.aarch64.rpm"
RPM_HASH = "85c4dd9986e7ece7a9e77243ce7cf938d93b643a3760a5925b3495582ad11a78cfc005f60b8b81e1d1dfb1ff23e11759416cc88f87c3e31a71a9cf696d80519d"

RPROVIDES:${PN} += "libvsmbr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsmbr.so.1"

inherit rpm
