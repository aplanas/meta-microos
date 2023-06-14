SUMMARY = "Kea DHCP process abstraction library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-process40-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "3fa6d913ed803d22d8c7176d2243d63895710bd48a71879311b9013486054c5f41eec3da1936e01c1a32770047e9cf077948b9c65b7151117e6c55f35f62bc9f"

RPROVIDES:${PN} += "libkea-process.so.40 \
libkea-process40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-database.so.35 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-log.so.35 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
