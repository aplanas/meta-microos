SUMMARY = "Development headers and libraries for libdvbpsi"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi-devel-1.3.3-1.12.aarch64.rpm"
RPM_HASH = "26ae0e4f71fa165ed2406d22e3299253b30f5a14e89c2646ee0d96f0ee25c6c1cf8d95efdb84ee3b5e8c234f85726f38829b70790c3031b1d648cd9926ac5645"

RPROVIDES:${PN} += "libdvbpsi-devel \
libdvbpsi-devel(aarch-64) \
pkgconfig(libdvbpsi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbpsi10"

inherit rpm
