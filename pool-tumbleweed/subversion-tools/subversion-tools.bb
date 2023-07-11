SUMMARY = "Tools for Subversion"
DESCRIPTION = "This package contains some tools for subversion server and \
repository admins."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-tools-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "3a99b1b77502d089ec1b7580f843b8c2252891788989f25c06c819e8cb5a658e3026b608e94ef916be9bb4cd7894d8823d673dd2055b154db2e9cbcd10d5cb29"

RPROVIDES:${PN} += "subversion-tools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0"

inherit rpm
