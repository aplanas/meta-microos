SUMMARY = "AV1 encoder library"
DESCRIPTION = "rav1e is an AV1 video encoder libary. It is designed to eventually cover all \
use cases, though in its current form it is most suitable for cases where \
libaom (the reference encoder) is too slow."
LICENSE = "BSD-2-Clause"

PV = "0.6.4+0"

RPM_NAME = "librav1e0-0.6.4+0-1.2.aarch64.rpm"
RPM_HASH = "cda2e80e338184fdc0391d6a36d66e75d93b896742f64b3c63ffed9044c8740c343542e55a8f544481240be3b1a78e2959a92a740347b60ce3250d8baf7c1045"

RPROVIDES:${PN} += "librav1e.so.0 \
librav1e0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
