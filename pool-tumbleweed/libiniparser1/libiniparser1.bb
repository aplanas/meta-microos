SUMMARY = "Library to parse ini files"
DESCRIPTION = "Libiniparser offers parsing of ini files from the C level. \
 \
This package includes the libiniparser1 library."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "libiniparser1-4.1-3.1.aarch64.rpm"
RPM_HASH = "ddce02f279bfff2accf58810bad70398d6b21d42d82e3624334a5ee1851dcf2a7bbfb70069b5a8dff44c6dd3d450e9e0353c2e938f82bf4061a4a15256d2bd7b"

RPROVIDES:${PN} += "libiniparser.so.1 \
libiniparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
