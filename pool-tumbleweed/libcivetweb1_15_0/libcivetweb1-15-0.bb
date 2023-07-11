SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libcivetweb1_15_0-1.16-1.2.aarch64.rpm"
RPM_HASH = "56b92917b3126b2681ac6e2bd03dd7f29858086d326a36b54c4ca45ab233ce02a7750670b513347b583ec9a3db54ea62c768e3c8c83ab620239481b50d5acc57"

RPROVIDES:${PN} += "libcivetweb.so.1.15.0 \
libcivetweb1-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
