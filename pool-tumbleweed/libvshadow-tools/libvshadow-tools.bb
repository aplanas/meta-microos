SUMMARY = "Tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Tools to access the Volume Shadow Snapshot (VSS) format. The VSS \
format is used by Windows, as of Vista, to maintain copies of data on \
a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-tools-20221030-3.7.aarch64.rpm"
RPM_HASH = "2da896a3ff5b78010a03bdfc15bfbbcc77687ae35f026e2e213a2c1904f26168ddbf4bb483e019f77e68999ea10774108bd14a3f8baa7110ca969aa51a0f612f"

RPROVIDES:${PN} += "libvshadow-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfuse.so.2 \
libvshadow.so.1"

inherit rpm
