SUMMARY = "JACK plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the JACK plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-jack-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "21bfa1e944d7151987fd553526ab1e7661915bdd3639605e9e5e49744ef8b44767974f8f2d0f12d8b017929452e3fd57dfabb87f2520e5789e35aa76921b380a"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-jack \
libaudjack.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
