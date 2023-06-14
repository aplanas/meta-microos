SUMMARY = "Qucs with SPICE"
DESCRIPTION = "Qucs-S is a spin-off of the Qucs cross-platform circuit simulator. 'S' letter indicates SPICE. The purpose of the Qucs-S subproject is to use free SPICE circuit simulation kernels with the Qucs GUI. It merges the power of SPICE and the simplicity of the Qucs GUI. Qucs intentionally uses its own SPICE incompatible simulation kernel Qucsator. It has advanced RF and AC domain simulation features, but most of the existing industrial SPICE models are incompatible with it. Qucs-S is not a simulator by itself, but it requires to use a simulation backend with it. The schematic document format of Qucs and Qucs-S are fully compatible."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "qucs-s-1.0.2-1.1.aarch64.rpm"
RPM_HASH = "2e2178975f1bb9f870321f23c26bbb3df4fa8b899df452dc845887489904b7edf034c1219c1c144e5a94cf240dec958e7583e1982811bd71445c856db8d5e186"

RPROVIDES:${PN} += "qucs-s"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
ngspice"

inherit rpm
