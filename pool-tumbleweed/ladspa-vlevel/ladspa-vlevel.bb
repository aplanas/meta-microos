SUMMARY = "LADSPA vlevel plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin and a tool to amplify the soft parts of music so you don't have to \
fiddle with the volume control."
LICENSE = "GPL-2.0+"

PV = "0.5"

RPM_NAME = "ladspa-vlevel-0.5-4.28.aarch64.rpm"
RPM_HASH = "419cbb57bf6f64aede4119148157b2da25a0fcfcb6f835186a9e05d45ccd7723146f644d8d401303f9d65dc53e528a1dbb1c2c34a007ab2b654206c8e96b2af3"

RPROVIDES:${PN} += "ladspa-vlevel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
