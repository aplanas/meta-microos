SUMMARY = "TN3270 Access library"
DESCRIPTION = "TN3270 access library, originally designed as part of the pw3270 application. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.4+git20230322"

RPM_NAME = "lib3270-5_4-5.4+git20230322-1.3.aarch64.rpm"
RPM_HASH = "05f69068afed80159ebc29917d83411512917af7c1f64dedb46f140fd14bd99e2f452bcf949c6ac8b49af241f094d853e9ea184e3236c7da3fc7471d5c5d37fd"

RPROVIDES:${PN} += "lib3270-5-4 \
lib3270.so.5.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libssl.so.3"

inherit rpm
