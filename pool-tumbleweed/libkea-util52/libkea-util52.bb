SUMMARY = "Kea utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-util52-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "d6d919851ac8bab7e2caa85f31d7409026f028443f75bc451ee1add34b001674745ac8dd6cf10013e053f41f7a95571cec1c74f6a51bb881f491d521c2791bd5"

RPROVIDES:${PN} += "libkea-util.so.52 \
libkea-util52"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libstdc++.so.6"

inherit rpm
