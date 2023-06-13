SUMMARY = "TN3270 Access library"
DESCRIPTION = "TN3270 access library, originally designed as part of the pw3270 application. \
 \
For more details, see https://softwarepublico.gov.br/social/pw3270/ ."
LICENSE = "LGPL-3.0-only"

PV = "5.4+git20230322"

RPM_NAME = "lib3270-5_4-5.4+git20230322-1.1.aarch64.rpm"
RPM_HASH = "419f2aacbe5de64edb2bad880c2a9018ccb5b8f4b0ed5b2a8502673604e8cd8e2adf70538d4e10adf02e917b182bb6ff593ce44a6a4cda1a07c7d350d4634cb3"

RPROVIDES:${PN} += "lib3270-5_4 \
lib3270-5_4(aarch-64) \
lib3270.so.5.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
