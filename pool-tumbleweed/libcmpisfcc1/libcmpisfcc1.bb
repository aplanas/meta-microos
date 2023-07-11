SUMMARY = "Common Manageability Programming Interface of the Small Footprint CIM Client"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcmpisfcc1-2.2.9~rc1-1.1.aarch64.rpm"
RPM_HASH = "5cd42ad4ebe958289c8f70659c9758aa8ff559949a690db3e586a69a8af90998dbbe324a79467d71cb709a6eb5d25dc2a99a2654d986eb19ab9de3720f8082ff"

RPROVIDES:${PN} += "libcmpisfcc.so.1 \
libcmpisfcc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcimcclient.so.0"

inherit rpm
