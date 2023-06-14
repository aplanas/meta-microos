SUMMARY = "LADSPA alienwah plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) plugin to implement the Alien Wah effect."
LICENSE = "GPL-2.0+"

PV = "1.13"

RPM_NAME = "ladspa-alienwah-1.13-3.24.aarch64.rpm"
RPM_HASH = "5478304aebc543c7da1fa2894355aae52c08c38b79a780c84c588b6b7bff22b5d60549fa2493a3da28929fc45bfb629f075c25bcd29fe22429590e7664853d00"

RPROVIDES:${PN} += "ladspa-alienwah"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
