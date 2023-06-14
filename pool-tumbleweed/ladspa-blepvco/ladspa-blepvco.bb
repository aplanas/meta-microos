SUMMARY = "LADSPA blepvco plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
blepvco plugins for three anti-aliased, minBLEP-based, hard-sync-capable \
oscillator plugins."
LICENSE = "GPL-2.0+"

PV = "0.1.0"

RPM_NAME = "ladspa-blepvco-0.1.0-4.24.aarch64.rpm"
RPM_HASH = "f59b29c7f2ce56af8e393326552446b215df9f1326d4a6c4a2d78ba1fb7ef1a4b7588b9bd0c89c4f7fbeffc03cbd2af6ba174311bb98d9bf55f1e3da65f8fae7"

RPROVIDES:${PN} += "ladspa-blepvco"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
