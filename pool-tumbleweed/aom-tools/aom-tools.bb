SUMMARY = "AV1 Codec Library Tools"
DESCRIPTION = "This package contains tools included with libaom, a library for \
the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.1"

RPM_NAME = "aom-tools-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "4c306873fa222473c94325d8b43d3aae4ba97cb29585b2585e1110ee38a68263eb4c56bda70a951eddc07e286a987341007d170f67c7b0e43dba125d625ee17c"

RPROVIDES:${PN} += "aom-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
