SUMMARY = "Kea I/O utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-util-io0-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "dac888308f429698bebd2b0dbcb0202b09597cf3799829921bee4f04c942fce16ef0205e51d9fe0db1572758ac5004e9b77002c3baca2c0bbaf207591cdfa21f"

RPROVIDES:${PN} += "libkea-util-io.so.0()(64bit) \
libkea-util-io0 \
libkea-util-io0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-exceptions.so.13()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
