SUMMARY = "Electromagnetic field solver using the EC-FDTD method"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "dcbf9820644c442179d72e8ce85c851c6e7c7e6845fa55343a1a2f7efdf2dd9cd6562161cf889a8260e3479fadfb244b2efdeaa6fd70e0bc3c2fa7825eccba93"

RPROVIDES:${PN} += "openEMS"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnf2ff.so.0 \
libopenEMS.so.0 \
libstdc++.so.6"

inherit rpm
