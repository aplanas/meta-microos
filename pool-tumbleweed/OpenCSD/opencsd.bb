SUMMARY = "CoreSight Trace Decode library"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "aa5324b4bf2f5a2b69dbc5732664a6e01d502201ebb344a5e0b6ec36ce33ed14c024d80e05d73230ad16a5f13e43e02060ff7eee9db7402a03db1a892b6427d5"

RPROVIDES:${PN} += "OpenCSD"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libopencsd.so.1 \
libstdc++.so.6"

inherit rpm
