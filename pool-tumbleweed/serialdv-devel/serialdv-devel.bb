SUMMARY = "Development files for libserialdv"
DESCRIPTION = "A library that provides an interface for audio encoding and decoding with \
AMBE3000 based devices in packet mode over a serial link. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libserialdv."
LICENSE = "GPL-3.0-only"

PV = "1.1.4"

RPM_NAME = "serialdv-devel-1.1.4-1.8.aarch64.rpm"
RPM_HASH = "afcccada8901cf3efb5e385cc4da1261dac1dc387c0294143506058019705104cbe97f3344a15efcb92d2f84094ddecff052bceadef173f57a1aa64657409d1b"

RPROVIDES:${PN} += "serialdv-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libserialdv.so.1 \
libserialdv1 \
libstdc++.so.6"

inherit rpm
