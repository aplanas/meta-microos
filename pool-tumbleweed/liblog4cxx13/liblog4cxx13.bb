SUMMARY = "Log4j like C++ Logging Library"
DESCRIPTION = "Log4cxx is a port to C++ of the log4j logging library."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "liblog4cxx13-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "eb85f7041d40c40fc8766abbb5faf321f505f5ea9b27fec7ca7fe3c2ec723c237a193600479fa1ed5ade3c79065aaf2e190e07975285b15af4dcbfc3c8c3c972"

RPROVIDES:${PN} += "liblog4cxx.so.13 \
liblog4cxx13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
