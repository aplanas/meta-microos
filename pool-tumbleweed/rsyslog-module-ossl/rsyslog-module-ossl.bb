SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the OpenSSL library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-ossl-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "06a74edbc5f18778be77b35c968f63177e9951da1abfffebf56cd3c6a38388d7f4128ab3310f905739780c79ad19cfb717b6bb18685f36e5564bf662c4e3617f"

RPROVIDES:${PN} += "rsyslog-module-ossl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
rsyslog"

inherit rpm
