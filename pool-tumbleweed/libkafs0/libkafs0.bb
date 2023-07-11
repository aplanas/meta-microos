SUMMARY = "KAFS support for Heimdal Kerberos"
DESCRIPTION = "This package contains the library for supporting the in-kernel Andrew File System."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libkafs0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "10c515bba61a8fc95ecd1f59e1d37f430bdc66eee3c5defb04a702de294c751c5a8f6ef7073cbf186ce16bca0f106e3dec6d00172e1f2403a65666ad0e874ecd"

RPROVIDES:${PN} += "libkafs.so.0 \
libkafs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libhcrypto.so.4 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
