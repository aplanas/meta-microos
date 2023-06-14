SUMMARY = "Library and tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow1-20221030-3.5.aarch64.rpm"
RPM_HASH = "6f3676fdfaa92cf014940f17895dacb67d63e4646a1f570bd284e60770e5b000b773ba464d86eb9004c262ad5ffa3fecbd276ec21784f394ca4ed24b24293d92"

RPROVIDES:${PN} += "libvshadow.so.1 \
libvshadow1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1"

inherit rpm
