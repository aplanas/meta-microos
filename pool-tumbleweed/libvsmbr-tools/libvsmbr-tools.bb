SUMMARY = "Utilities for inspecting MS-DOS partition tables"
DESCRIPTION = "This subpackage contains the utility programs from libvsmbr to \
inspect MS-DOS partition tables."
LICENSE = "LGPL-3.0-or-later"

PV = "20210509"

RPM_NAME = "libvsmbr-tools-20210509-5.1.aarch64.rpm"
RPM_HASH = "084fc4d2a5030919396ccebd2118eb6a94960f2e0a813e0f49dca2c4551fe3d2de0358fee5fded9ee5d3829c78586a57f91d575a679bcfed78493ef1bd15777b"

RPROVIDES:${PN} += "libvsmbr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libvsmbr.so.1"

inherit rpm
