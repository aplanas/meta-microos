SUMMARY = "GuardTime KSI API"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library"
LICENSE = "Apache-2.0"

PV = "3.4.0.5"

RPM_NAME = "libksi1-3.4.0.5-3.24.aarch64.rpm"
RPM_HASH = "c7178422a7cda7851206a644943cda58bfd7a1c8e304bbc79f16f7fca175f64003d5183192b96089285081c838e81a1a4acd1e41c1953def793084d4a448edd6"

RPROVIDES:${PN} += "libksi.so.1()(64bit) \
libksi1 \
libksi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
