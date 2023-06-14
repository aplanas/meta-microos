SUMMARY = "Suite of gimp plugins for texture synthesis"
DESCRIPTION = "This package is a set of plugins for use with the Gimp program. \
The package includes: \
 \
- resynthesizer plugin engine (without a GUI) \
- resynthesizer-gui plugin control panel for the engine \
- various plugins (in Python language) that call the resynthesizer engine"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3~git.20220422"

RPM_NAME = "gimp-plugin-resynthesizer-2.0.3~git.20220422-1.3.aarch64.rpm"
RPM_HASH = "608e1b2d8ce89ec5cb316e497e3e2f3586755dd197df6d913d7f4587ee5f197c2473c6b3e0895304c4e930ca9b42b2e64ee86b8fa7de3388f91c9ce17b69b23f"

RPROVIDES:${PN} += "gimp-plugin-resynthesizer"

RDEPENDS:${PN} += "/usr/bin/env \
gimp-plugins-python \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libglib-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6"

inherit rpm
