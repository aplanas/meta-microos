SUMMARY = "Open Path Guiding Library"
DESCRIPTION = "Open Path Guiding Library (Intel® Open PGL) implements a set of representations \
and training algorithms needed to integrate path guiding into a renderer. Open \
PGL offers implementations of current state-of-the-art path guiding methods, \
which increase the sampling quality and, therefore, the efficiency of a \
renderer."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "libopenpgl0-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "3f3b7b619662d6efde76b0fac29554e2db16788e0915d61b8a07483ee3b8fb09fd1d716303ec47efe95744b46a6557290cf4e556cfe6aa9a238faf263a61d0fd"

RPROVIDES:${PN} += "libopenpgl.so.0 \
libopenpgl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
