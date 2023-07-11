SUMMARY = "LADSPA MCP-plugins"
DESCRIPTION = "This package provides a set of audio plugins for LADSPA \
(Linux Audio Developer's Simple Plug-in API) by Fons Adriaensen, \
including moog VCF, chrous and phaser effects."
LICENSE = "GPL-2.0+"

PV = "0.4.0"

RPM_NAME = "ladspa-MCP-0.4.0-4.27.aarch64.rpm"
RPM_HASH = "d9a301a3df5e36387c7dc92dcc2d52ffb7a2653a89ef8dcce2d08cf3b35f092c88ace0811a33886104aed0d543fb256a4a5637c522b0f3c0e511c15a0e914e21"

RPROVIDES:${PN} += "ladspa-MCP"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
