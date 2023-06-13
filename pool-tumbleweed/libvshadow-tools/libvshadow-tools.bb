SUMMARY = "Tools to access the Volume Shadow Snapshot (VSS) format"
DESCRIPTION = "Tools to access the Volume Shadow Snapshot (VSS) format. The VSS \
format is used by Windows, as of Vista, to maintain copies of data on \
a storage media volume."
LICENSE = "LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-tools-20221030-3.5.aarch64.rpm"
RPM_HASH = "e0d84e4e1d779a150f2d7e94361803acbe979e44a043d003f015c2695d3214b667d54aaef86569df7988272ebb36a84b0055f2ac1a1971cbd68f4b53a0efb00e"

RPROVIDES:${PN} += "libvshadow-tools \
libvshadow-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libvshadow.so.1()(64bit) \
libvshadow.so.1(V_20221030)(64bit)"

inherit rpm
