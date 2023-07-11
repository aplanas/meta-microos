SUMMARY = "Galera support library"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
This package provides the libgalera_smm library."
LICENSE = "GPL-2.0-only"

PV = "26.4.14"

RPM_NAME = "galera-4-wsrep-provider-26.4.14-1.2.aarch64.rpm"
RPM_HASH = "82f8a9cf596b33ba095ea399a836e0a6e15092e22d0c16673844244a2702b44922612bea32d16f6b70047925e69148fb6d9320ac4d97c390dbd59cc1c1a599a7"

RPROVIDES:${PN} += "config-galera-4-wsrep-provider \
galera-4-wsrep-provider \
libgalera-smm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
mariadb-galera"

inherit rpm
