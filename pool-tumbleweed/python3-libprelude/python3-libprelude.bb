SUMMARY = "Python 3 bindings for libprelude"
DESCRIPTION = "Python 3 bindings for libprelude generated by SWIG."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "python3-libprelude-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "20df04bd1ad270a8523ca85f4030f218097bc14422d6b5dac7287183a299c922ad0e54ceb77f3e9d8e0a9717e302828ba37846f7eab25e6ee9e9a35c76cd6427"

RPROVIDES:${PN} += "python3-libprelude \
python3.11dist-prelude \
python3dist-prelude"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libprelude28 \
libpreludecpp.so.12 \
libstdc++.so.6 \
python-abi"

inherit rpm
