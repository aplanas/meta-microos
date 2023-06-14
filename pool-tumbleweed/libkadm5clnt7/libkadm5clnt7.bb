SUMMARY = "Client library for Heimdal Kerberos"
DESCRIPTION = "This package contains the client library for Heimdal's kadmin program."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkadm5clnt7-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "028e0e9f98de6652b18d9b4b73cd3d84c40ca3b841de6c0d51ad5c35420dda6a74d6635b78122f81345443f30a5ea53ecd76251ac08d3913057121d21653c030"

RPROVIDES:${PN} += "libkadm5clnt.so.7 \
libkadm5clnt7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
