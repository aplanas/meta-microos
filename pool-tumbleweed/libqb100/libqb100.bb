SUMMARY = "An IPC library for high performance servers"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6+20220323.758044b"

RPM_NAME = "libqb100-2.0.6+20220323.758044b-1.3.aarch64.rpm"
RPM_HASH = "f912c8cf021aef31fed28fa5490cc512733401e3fd8a6a6fba4abf98b897e8b58c9259db16bbc336964d23636d25d34c17ace05f1eefe7a3aacdb66001f4bbd1"

RPROVIDES:${PN} += "libqb.so.100 \
libqb100"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
