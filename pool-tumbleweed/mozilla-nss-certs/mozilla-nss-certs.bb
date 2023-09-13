SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.93"

RPM_NAME = "mozilla-nss-certs-3.93-1.1.aarch64.rpm"
RPM_HASH = "eda45fd0d3424893b2abc880431a2dff32d248776d84fea5bccbf06aa024bd4a2f61b491d9ec5632c0112e55631eac459e9988b207d2f2b25ad1a72ebbe44ce6"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
