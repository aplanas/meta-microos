SUMMARY = "Library for Decoding and Generating MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi10-1.3.3-1.13.aarch64.rpm"
RPM_HASH = "f4659212b5ffdd5c2d40742fb6cb5f6629af312cfc0b7c148472d6f884b574a392f45939a662ebaae03cac6a909a08d043f0159897360a0554d0e18026399249"

RPROVIDES:${PN} += "libdvbpsi.so.10 \
libdvbpsi10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
