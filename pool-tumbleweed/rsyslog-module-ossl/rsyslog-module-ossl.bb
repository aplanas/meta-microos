SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the OpenSSL library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-ossl-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "c7b96b717d859fe697104616e3b389e0f24477c2c098e114151ea1efe2a0379a6883b69ca2f15b954b5bf5b7156733741028286309613b81ac7111af87e9c8c2"

RPROVIDES:${PN} += "rsyslog-module-ossl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
rsyslog"

inherit rpm
