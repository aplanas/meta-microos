SUMMARY = "LADSPA FIL-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement four-band parametric equaliser.  Each section has \
an active/bypass switch, frequency, bandwidth and gain controls. There \
is also a global bypass switch and gain control."
LICENSE = "GPL-2.0+"

PV = "0.3.0"

RPM_NAME = "ladspa-FIL-0.3.0-4.24.aarch64.rpm"
RPM_HASH = "0da987289c63e0c6689246f7ce9bcd09c12b08991f5979723324876a595d077668b87157fcca82b5f9f9a8b612fa2adcff237ea70e0fe7e57f8c41dcea3ae194"

RPROVIDES:${PN} += "ladspa-FIL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
