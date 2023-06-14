SUMMARY = "Python bindings for GDCM"
DESCRIPTION = "A Python module for interfacing with the GDCM library."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "python3-gdcm-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "bcafc16fa79f1c53a368362c7e49f82c321ea508a70888bd64e540f3279755b0f5f6d164cbb6037e307323387b3f3e233364b2e46ae66c796f68fdcbd329da5d"

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
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
