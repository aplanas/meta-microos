SUMMARY = "Secure Sockets and Transport Layer Security"
DESCRIPTION = "The OpenSSL Project is a collaborative effort to develop a robust, \
commercial-grade, full-featured, and open source toolkit implementing \
the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS \
v1) protocols with full-strength cryptography. The project is managed \
by a worldwide community of volunteers that use the Internet to \
communicate, plan, and develop the OpenSSL toolkit and its related \
documentation."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "openssl-3.1.2-1.1.noarch.rpm"
RPM_HASH = "6f2d38e34c3fa27a6bf2850d20effed2f7cedf1430fe063c3694edf3c944f452736f1243818a6467428881afb59e4d2a9f67dd361854efbe662b233451718c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl \
openssl-cli"

RDEPENDS:${PN} += "openssl-3"

inherit rpm
