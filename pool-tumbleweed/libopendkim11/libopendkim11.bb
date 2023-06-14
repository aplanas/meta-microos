SUMMARY = "Library for performing DKIM signing and verification"
DESCRIPTION = "This package provides the shared library libopendkim which \
performs DKIM signing and verification."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libopendkim11-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "898317e0fb06a8437e888f7b1c18fa2b138a46f24f5d6d25a4fa9267f291579eb379a01bcb42316277cdd98c3eeadc7a8767535acd5dd04b0cbc6919b98d32a1"

RPROVIDES:${PN} += "libopendkim.so.11 \
libopendkim11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libtre.so.5"

inherit rpm
