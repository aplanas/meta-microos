SUMMARY = "Python bindings for GDCM"
DESCRIPTION = "A Python module for interfacing with the GDCM library."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "python3-gdcm-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "44d6810fdf4322a2493616feeb070840013c069feb6a611aeb272d2e8a3cfceb1d2f92496ea1af735c20635de5624ad224b4efb2d52304782d0b0bea63c5b088"

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
