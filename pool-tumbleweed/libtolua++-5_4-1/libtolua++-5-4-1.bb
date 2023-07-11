SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-1-1.0.93-10.3.aarch64.rpm"
RPM_HASH = "432ddada3dd9ba5eb18cecb3613f02c1c367fb19d7cdce5c05249c879d005d81aa081ee1dca686000812a6c21c77c0d80b0a078dc2fc30d4a5bfe0992393db9f"

RPROVIDES:${PN} += "libtolua++-5-4-1 \
libtolua++-5.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libm.so.6"

inherit rpm
