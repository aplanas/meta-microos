SUMMARY = "JACK plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the JACK plugin"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-plugin-jack-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "4db5cd2bba7e52ec0a5996d9fb1ad72cc39ed439d9f2fcb8f9212edbaecd8be7ef36d268ed24f03955fd873d87ba0ff001833e66ebd476edf2d256259c05e261"

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
