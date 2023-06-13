SUMMARY = "Pulseaudio plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Pulseaudio plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-pulse-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "c15f714b948824010b4acde32e8a2de08bb6fc3299bf0ed45524d793d8591f99ba4b1411ee7ec03c389527b4a4f931d4c0aa90f1a79fbba19814c2f1bdc163ce"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-pulse \
audaspace-plugin-pulse(aarch-64) \
libaudpulseaudio.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaudaspace.so.1.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
