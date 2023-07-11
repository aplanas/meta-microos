SUMMARY = "PAPI runtime library"
DESCRIPTION = "This package contains the PAPI runtime library."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "libpapi-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "3a9c29c83e4b0dc3e23bb95e30a801be42b617159e2e2a34b0852eda6903776be0de50198d32822085a858f097f349f888159e6df1e4ebf4165572279b7afc21"

RPROVIDES:${PN} += "libpapi \
libpapi.so.7.0 \
libsde.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpfm.so.4"

inherit rpm
