SUMMARY = "Tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Tools to access the Volume Shadow Snapshot (VSS) format. The VSS \
format is used by Windows, as of Vista, to maintain copies of data on \
a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-tools-20221030-3.5.aarch64.rpm"
RPM_HASH = "e0d84e4e1d779a150f2d7e94361803acbe979e44a043d003f015c2695d3214b667d54aaef86569df7988272ebb36a84b0055f2ac1a1971cbd68f4b53a0efb00e"

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
