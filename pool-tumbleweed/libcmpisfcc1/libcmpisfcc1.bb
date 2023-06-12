SUMMARY = "Common Manageability Programming Interface of the Small Footprint CIM Client"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.8"

RPM_NAME = "libcmpisfcc1-2.2.8-1.23.aarch64.rpm"
RPM_HASH = "484362513663ccc5cea11351834f1a830133f92fc4840b8e179af362d4a538291bcde5f1286d5ad876cb65491ecbbdf341b44f835c043d5df651458b85862690"

RPROVIDES:${PN} += "libcmpisfcc.so.1()(64bit) \
libcmpisfcc.so.1(CMPISFCC_2.0)(64bit) \
libcmpisfcc1 \
libcmpisfcc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcimcclient.so.0()(64bit) \
libcimcclient.so.0(CIMCCLIENT_1.0)(64bit)"

inherit rpm
