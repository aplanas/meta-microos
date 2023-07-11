SUMMARY = "Openmpt's libmodplug"
DESCRIPTION = "The ModPlug mod file playing library (emulated via libopenmpt)."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.0"

RPM_NAME = "libopenmpt_modplug1-0.8.9.0-1.13.aarch64.rpm"
RPM_HASH = "0e5a9e090896dcf0f744d7b6f3260337a91a312d0f822c1c3f0a152a41d7f8567685f35d0ed71d17c42b65599d0a3a90a1d1991e74b2f1241643af102fbfdb22"

RPROVIDES:${PN} += "libopenmpt-modplug.so.1 \
libopenmpt-modplug1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenmpt.so.0 \
libstdc++.so.6"

inherit rpm
