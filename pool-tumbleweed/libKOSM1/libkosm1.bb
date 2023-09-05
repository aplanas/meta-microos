SUMMARY = "OSM primitives for kosmindoormap"
DESCRIPTION = "OSM primitives for kosmindoormap."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "libKOSM1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "181ec2b197328dac768263bc497221362337fe593df762f7654bae2f273de920cf87fab2e2f75ed80fee0885e3246dd8e579e1927a5799d9c5b434cb1136b493"

RPROVIDES:${PN} += "libKOSM.so.1 \
libKOSM1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
