SUMMARY = "Authoritative dns server for A/AAAA container records"
DESCRIPTION = "Aardvark-dns is an authoritative dns server for A/AAAA container records. \
It can forward other requests to configured resolvers."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "aardvark-dns-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "28a8b568fbe726e16ff7b741cde3092919b5fd74146948b211682482f7dbe95f5aea50dc259e9e855e51e26cc488d402708b9b1d7aa7e9febfed050f4d5a353e"

RPROVIDES:${PN} += "aardvark-dns"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
