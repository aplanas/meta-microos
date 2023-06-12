SUMMARY = "Development files for GF(2^e) arithmetic with libm4rie"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4rie."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4rie-devel-20200125-1.2.aarch64.rpm"
RPM_HASH = "10a197aa010bb4753247051a1f48028847a54f6269b07f3a6c82128fb745eb29154792ee75c1e9867b9c396372a3b975586cf6a87760560f337af7ea0813a522"

RPROVIDES:${PN} += "libm4rie-devel \
libm4rie-devel(aarch-64) \
pkgconfig(m4rie)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libm4rie-0_0_20200125"

inherit rpm
