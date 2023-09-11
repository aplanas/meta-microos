SUMMARY = "A wrapper around CASACORE, the radio astronomy library"
DESCRIPTION = "A python wrapper around CASACORE, the radio astronomy library"
LICENSE = "LGPL-3.0-or-later"

PV = "3.5.2"

RPM_NAME = "python3-casacore-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "c5de5c5b0229aba1f62b5988dd2c975bc0abf7abe169335a22b3a8eba1676450c5ac2321aa748bf07e4161e308fed41d4409921e06ae586d4553da5e5a685326"

RPROVIDES:${PN} += "python3-casacore \
python3.11dist-python-casacore \
python3dist-python-casacore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libcasa-casa.so.7 \
libcasa-derivedmscal.so.7 \
libcasa-images.so.7 \
libcasa-meas.so.7 \
libcasa-measures.so.7 \
libcasa-ms.so.7 \
libcasa-python3.so.7 \
libcasa-scimath.so.7 \
libcasa-tables.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python3-numpy \
python3-six"

inherit rpm
