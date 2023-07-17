SUMMARY = "Authoritative dns server for A/AAAA container records"
DESCRIPTION = "Aardvark-dns is an authoritative dns server for A/AAAA container records. \
It can forward other requests to configured resolvers."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "aardvark-dns-1.7.0-2.1.aarch64.rpm"
RPM_HASH = "7293452267c91566d94aa3c974e04db1d6dff023095ad16ac669c5df06915e3dd93b74b8312a8fd2c3b0829accda80430d5737b3d6256122607fd8dcd9aa5ec6"

RPROVIDES:${PN} += "aardvark-dns"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
