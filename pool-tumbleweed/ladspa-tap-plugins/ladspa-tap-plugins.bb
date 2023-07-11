SUMMARY = "LADSPA TAP plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) TAP plugins, short for Tom's Audio Processing, \
which contains a collection of various audio plugins."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "ladspa-tap-plugins-1.0.1-1.15.aarch64.rpm"
RPM_HASH = "2254349bdf9cd2b6ede0ad573548430e0a4acf120e87bb50a14db3557ba8b1a2267d407550ddc5392301e47b98733230660a2b5acf635478e77a5c3882b10d40"

RPROVIDES:${PN} += "ladspa-tap-plugins"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
