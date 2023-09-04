SUMMARY = "Library and tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow1-20221030-4.1.aarch64.rpm"
RPM_HASH = "de1ee557eabd7036ca587a13da659e6a77d94fbec89901faa3f867cfe010c6db0d817b3bcb405a1be05402257e7adb6e651580f5d6132bd875462fc695c093a0"

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
