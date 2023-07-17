SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnk2 to \
read Outlook Nickfile files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-tools-20221122-3.6.aarch64.rpm"
RPM_HASH = "a5219f8ff8aa89f704efa00cc3e78a654c4bc37e34eac2fbdc3d24b4ce881aa3a7426ed737e2cbc525f3a36d2ee15d541d813a44ba80206cdcaf2032d3fbbf51"

RPROVIDES:${PN} += "libnk2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfvalue.so.1 \
libnk2.so.1"

inherit rpm
