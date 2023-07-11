SUMMARY = "High-level C binding for ZeroMQ"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
This package contains key creation utility zmakecert."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-4.2.1-1.9.aarch64.rpm"
RPM_HASH = "00b51768a942739b49b1463f0d5d7e0e0b1161f06fbc1b0851b28cbc6fd9e2538366a32824e55f575965faed545532dc261418438d74765d4053188aabb1ffb1"

RPROVIDES:${PN} += "czmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libczmq.so.4"

inherit rpm
