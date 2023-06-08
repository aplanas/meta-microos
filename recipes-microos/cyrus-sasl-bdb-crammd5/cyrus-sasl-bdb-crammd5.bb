SUMMARY = "Plugin for the CRAMMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-crammd5-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "e52ed9d24d0cb3958780e8e3f4016cf5bcfb4a868280b264f19b61909d7f0923cca58cfd6c987dd86d89a1ae70eb448cc243d1d5d37cc4de96750ef052ae94aa"

RPROVIDES:${PN} += "cyrus-sasl-bdb-crammd5 cyrus-sasl-bdb-crammd5(aarch-64) libcrammd5.so.3()(64bit)"
RDEPENDS:${PN} += "cyrus-sasl-bdb ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
