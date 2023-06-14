SUMMARY = "A wrapper around CASACORE, the radio astronomy library"
DESCRIPTION = "A python wrapper around CASACORE, the radio astronomy library"
LICENSE = "LGPL-3.0-or-later"

PV = "3.5.2"

RPM_NAME = "python3-casacore-3.5.2-1.5.aarch64.rpm"
RPM_HASH = "07f9a944af435ee24e12ac15a5a3dcf61237efd9fa1644273b94d0b9ac801cb7741d57a8d3d4eea198ef8b1db3e1402dd73dda891074c665e58151aa6ca77c83"

RPROVIDES:${PN} += "python3-casacore \
python3.10dist-python-casacore \
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
python3-configargparse \
python3-future \
python3-numpy \
python3-six"

inherit rpm
