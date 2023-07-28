SUMMARY = "Kea database abstraction library"
DESCRIPTION = "Kea's database abstraction library."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-database48-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "447d36d3dcc2fa8be77150a63e4488b0b96edc1919e9d882d39b6afe0fc62cf32c39036f0643ecbcd77421b2fd5d42af57d4918596c43cf07c8f1e310f22deb2"

RPROVIDES:${PN} += "libkea-database.so.48 \
libkea-database48"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.54 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
