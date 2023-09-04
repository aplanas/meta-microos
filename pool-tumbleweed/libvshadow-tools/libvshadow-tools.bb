SUMMARY = "Tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Tools to access the Volume Shadow Snapshot (VSS) format. The VSS \
format is used by Windows, as of Vista, to maintain copies of data on \
a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-tools-20221030-4.1.aarch64.rpm"
RPM_HASH = "eb19d79003b698b6f5b78da9c7d2e2c81ef3435b0c116fbda3949d777f5ab2b49679a4f08d78f1f9f152e81a344ea4f724bcca61f80acd005c4e5088fb640ba8"

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
