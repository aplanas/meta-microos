SUMMARY = "Collection of video sources and filters plugins"
DESCRIPTION = "This package provides a collection of video sources and filters plugins, \
using the Frei0r API."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-1.8.0-2.4.aarch64.rpm"
RPM_HASH = "f2adfe4fbc089e5d185ac286a38137818f9279d45d869947c5c06ded35a8d4988360f71e16fcd727c137e2fab880ca672ebc4a6e5349cc33f061d6aa6f07d9ba"

RPROVIDES:${PN} += "frei0r-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgavl.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
