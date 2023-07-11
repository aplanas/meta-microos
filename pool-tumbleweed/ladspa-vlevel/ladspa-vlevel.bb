SUMMARY = "LADSPA vlevel plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin and a tool to amplify the soft parts of music so you don't have to \
fiddle with the volume control."
LICENSE = "GPL-2.0+"

PV = "0.5"

RPM_NAME = "ladspa-vlevel-0.5-4.29.aarch64.rpm"
RPM_HASH = "658e1edf414fc5cecf0ec87ff1929a230f99700428dd8e9246b92ff2c69cbab9c2b409a15c8b07ea7a4947fbd6498f86c1a0b55c67b15d9f1182930644376e14"

RPROVIDES:${PN} += "ladspa-vlevel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
