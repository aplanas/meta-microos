SUMMARY = "Pulseaudio plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Pulseaudio plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-pulse-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "c15f714b948824010b4acde32e8a2de08bb6fc3299bf0ed45524d793d8591f99ba4b1411ee7ec03c389527b4a4f931d4c0aa90f1a79fbba19814c2f1bdc163ce"

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
