SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "The OpenSSL Project is a collaborative effort to develop a robust, \
commercial-grade, full-featured, and open source toolkit implementing \
the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS \
v1) protocols with full-strength cryptography. The project is managed \
by a worldwide community of volunteers that use the Internet to \
communicate, plan, and develop the OpenSSL toolkit and its related \
documentation."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "openssl-3.1.1-2.1.noarch.rpm"
RPM_HASH = "7d72059bbd6547a0e3edd1431fba03f1ebc6df28d4156e98f02a53d976cf1347340dbcd6b7fb310fca38c52ba2d16fd846241d790d8a2127b714916e0698f418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl \
openssl-cli"

RDEPENDS:${PN} += "openssl-3"

inherit rpm
