SUMMARY = "Library and tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Library and tools to access the Volume Shadow Snapshot (VSS) format. \
The VSS format is used by Windows, as of Vista, to maintain copies of \
data on a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow1-20221030-3.7.aarch64.rpm"
RPM_HASH = "be364616b4b7ba808e7aba6d5b9ef3acb39cef38e09fee61d431f0c668ccf4adf9a5c698825bfb8e2955749946346afd94901dabb4192d0385e6af3d9954a319"

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
