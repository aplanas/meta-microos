SUMMARY = "A wrapper around CASACORE, the radio astronomy library"
DESCRIPTION = "A python wrapper around CASACORE, the radio astronomy library"
LICENSE = "LGPL-3.0-or-later"

PV = "3.5.2"

RPM_NAME = "python3-casacore-3.5.2-1.6.aarch64.rpm"
RPM_HASH = "f78cd48fdcf3b39adff25bd24091ef108a8c1ee8fa614a9deebf5dd0ef77857c9293d467ac4b4dc2b532d114a609785257047386a67fe86609eff93b43026973"

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
python3-configargparse \
python3-future \
python3-numpy \
python3-six"

inherit rpm
