SUMMARY = "Kea DHCP process abstraction library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-process40-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "7e6b5a73a6ad32d7aa02615c9edf42ffcdf6bae6efc6726e7f8d42c078496e7bd3170fe9f0869ed9fc5e50d7a64fe5838545e3a737f7045c7a76435bd4e27970"

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
