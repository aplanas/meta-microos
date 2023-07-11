SUMMARY = "CUPS Driver Development Kit"
DESCRIPTION = "The CUPS Driver Development Kit (DDK) provides \
a suite of standard drivers, a PPD file compiler, \
and other utilities that can be used to develop \
printer drivers for CUPS."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-ddk-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "ff3eeb40320b8286fe7342af5f988c07afd5e67385bc24c331fcb7e74a44e1ba3feaf8db2983ef98694126954d90772841bb6b1ae4857bdb118ec1ce69c0a6c5"

RPROVIDES:${PN} += "cups-ddk \
cupsddk"

RDEPENDS:${PN} += "cups \
cups-devel \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
