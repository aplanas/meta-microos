SUMMARY = "Library for a lightweight and flexible command-line JSON processor"
DESCRIPTION = "Library for a lightweight and flexible command-line JSON processor."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "libjq1-1.6-3.4.aarch64.rpm"
RPM_HASH = "c2e0aa1ccc48bec8396e4d49fb9bfb02d617a7d0aaf2afdcc911b73e9e9364270bd47598474c32130321fbe1fb3c35178109593933e740166cc22c4fb87440f4"

RPROVIDES:${PN} += "libjq.so.1 \
libjq1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libonig.so.5"

inherit rpm
