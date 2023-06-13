SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the OpenSSL library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-ossl-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "757edd2b802e3fc2e30c1a2704f0e487d909a6fc3bb3e7d377282b850bd2e598f8e3866e1ce8306c6a8874bb4c2c7f75bcf7a211b11a930305f014686ceed432"

RPROVIDES:${PN} += "rsyslog-module-ossl \
rsyslog-module-ossl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
rsyslog"

inherit rpm
