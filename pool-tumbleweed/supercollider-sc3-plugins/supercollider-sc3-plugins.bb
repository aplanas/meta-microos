SUMMARY = "Collection of SuperCollider plugins"
DESCRIPTION = "Collection of free and usefull SuperCollider plugins"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-sc3-plugins-3.13.0-2.1.aarch64.rpm"
RPM_HASH = "78694ff3aaf75ac5adeaf7e8717d20c007305dee731a12d6881f1ba6b7cbec59f4ed80c210ac39bdb5ff65b8a2e671f5021768ca726469d0764e44c70f9f392d"

RPROVIDES:${PN} += "supercollider-sc3-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
supercollider"

inherit rpm
