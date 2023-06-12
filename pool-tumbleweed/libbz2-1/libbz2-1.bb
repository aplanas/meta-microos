SUMMARY = "The bzip2 runtime library"
DESCRIPTION = "The bzip2 runtime library"
LICENSE = "BSD-3-Clause"

PV = "1.0.8"

RPM_NAME = "libbz2-1-1.0.8-5.3.aarch64.rpm"
RPM_HASH = "426a8cee5b52decfe2d75cdc7604bd36fd9fd1a7dbc5de5cc7af91bc79ada7ac05ff7fa2c64422cdb46a8dc00b6fc392040f3f6dec7aa0eafe4f8dcf92c260ba"

RPROVIDES:${PN} += "libbz2-1 \
libbz2-1(aarch-64) \
libbz2.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
