SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python39-Durus-4.2-1.10.aarch64.rpm"
RPM_HASH = "ff360b77403cf54eb51c4a8eab9447e68520d11336af37f001cc1fa2f172b6bfb605b42243bc0bcadb7db29948aac4d07e20c3bc09a1c1b2683fe709cd773c3c"

RPROVIDES:${PN} += "python3.9dist(durus) \
python39-Durus \
python39-Durus(aarch-64) \
python3dist(durus)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
