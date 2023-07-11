SUMMARY = "Pulseaudio plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Pulseaudio plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-pulse-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "201a2d4ce7271c5ef522f0417ba2815a8c2289fa75bbd24f191c36879432d95b472399c7c8788ef2a28d93de2421a3f8b469aa031983bdca471777aa6c91c02c"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-pulse \
libaudpulseaudio.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
