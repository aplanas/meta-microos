SUMMARY = "LADSPA VCO-plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin to implement three anti-aliased oscillators."
LICENSE = "GPL-2.0+"

PV = "0.3.0"

RPM_NAME = "ladspa-VCO-0.3.0-4.25.aarch64.rpm"
RPM_HASH = "e2064c2a5bb6f71f824c811d20673ed6f4a04f30ad3ebf17480b265f625e4a8b25f74b27e4973d19877a66baf3d3a6994ae68e1aac3e9c5ee41c87701d8fba06"

RPROVIDES:${PN} += "ladspa-VCO \
ladspa-VCO(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
