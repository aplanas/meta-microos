SUMMARY = "CIM C Client Loader Implementation"
DESCRIPTION = "Small Footprint CIM Client Library (sfcc) Runtime Libraries"
LICENSE = "EPL-1.0"

PV = "2.2.9~rc1"

RPM_NAME = "libcimcclient0-2.2.9~rc1-1.1.aarch64.rpm"
RPM_HASH = "775c67b12f5e97b42322a4294377d826017e56ee6558a1ce3fdf8e368bf0e8a038f064480c2c76b34492558df0a25212e40dc72f361c8cd7e7b4d8ebe0876a74"

RPROVIDES:${PN} += "libcimcclient.so.0 \
libcimcclient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
