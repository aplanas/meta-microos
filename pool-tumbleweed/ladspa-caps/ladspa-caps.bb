SUMMARY = "LADSPA caps plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
caps plugins, the C* Audio Plugin Suite including instrument amplifier \
emulation, stomp-box classics, versatile virtual analog oscillators, \
fractal oscillation, reverb, equalization and others."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.26"

RPM_NAME = "ladspa-caps-0.9.26-1.12.aarch64.rpm"
RPM_HASH = "b2fb53655e6f6ade1034d88fe01e2bd75e013b17bd166b9204fe8a5a3a4f20ef5474451a9727c9c1e4100e9c36cc2d2c653a6a4d6b6133aa9014dfc5a98aaab1"

RPROVIDES:${PN} += "ladspa-caps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
