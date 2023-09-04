SUMMARY = "Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains a shared system library for Secure Reliable \
Transport (SRT)."
LICENSE = "MPL-2.0"

PV = "1.5.2"

RPM_NAME = "libsrt1_5-1.5.2-1.1.aarch64.rpm"
RPM_HASH = "b04d30d2c9b8fc1d68379ea853e9662d4ad0db4e5fbae74f166d4a4ba536fa218a94d7f42e3f65682d11724494bebefb6acc8df773f6da0ed6cee8beb292c956"

RPROVIDES:${PN} += "libsrt.so.1.5 \
libsrt1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
