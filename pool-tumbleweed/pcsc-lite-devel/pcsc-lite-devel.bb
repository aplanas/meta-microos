SUMMARY = "Development package for the MUSCLE project SmartCards library"
DESCRIPTION = "This package contains the development files for pcsc-lite. It allows to \
compile plugins for the pcsc-lite package."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "pcsc-lite-devel-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "eb573052df065fb8b6a309392714e609ad6e4c07cde3c38ac5f43263cdfeba3407d628cf06f1b80e58c30ff82b984c2fcbb7d3ada857b63f667cc75298f2979f"

RPROVIDES:${PN} += "pcsc-lite-devel \
pkgconfig-libpcsclite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
glibc-devel \
libpcsclite1 \
libpcscspy0 \
pcsc-lite"

inherit rpm
