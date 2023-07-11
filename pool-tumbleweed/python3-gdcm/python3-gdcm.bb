SUMMARY = "Python bindings for GDCM"
DESCRIPTION = "A Python module for interfacing with the GDCM library."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "python3-gdcm-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "f73969be9ffbb9f27f16a5b84b74ba8b693e8fbd07fec6f8dc95ac9736d1f8853b289a26ac8ce2cb1f8097ac9c64de7832e55cbb6d2fbbcf610433be992b7d35"

RPROVIDES:${PN} += "python3-gdcm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdcm3-0 \
libgdcmCommon.so.3.0 \
libgdcmDICT.so.3.0 \
libgdcmDSED.so.3.0 \
libgdcmIOD.so.3.0 \
libgdcmMEXD.so.3.0 \
libgdcmMSFF.so.3.0 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
