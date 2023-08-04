SUMMARY = "Network Security Services"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.91"

RPM_NAME = "mozilla-nss-3.91-1.1.aarch64.rpm"
RPM_HASH = "ae08b55f223398f5a0b5c471d4c803463070579ff463d89870b132b65b5c70f06de65865efcea1ceac9f66137b8389813bc6ec753e051cdfe71124df1ad1021a"

RPROVIDES:${PN} += "libnss3.so \
libnssutil3.so \
libsmime3.so \
libssl3.so \
mozilla-nss"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreebl3 \
libnspr4.so \
libnssckbi.so \
libplc4.so \
libplds4.so \
libsoftokn3 \
mozilla-nspr"

inherit rpm
