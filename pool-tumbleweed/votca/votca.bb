SUMMARY = "Versatile Object-oriented Toolkit for Coarse-graining Applications"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-2022.1-3.7.aarch64.rpm"
RPM_HASH = "9eda412426679ad3581efbc7a44da99033bcd975f0849bc214521aced3f8dccffa6c57099a74fb27f015b2746a0d561ae21cccb6693c402ea6a18330704e220e"

RPROVIDES:${PN} += "votca \
votca-csg \
votca-csg-apps \
votca-tools \
votca-xtp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5-cpp.so.200 \
libm.so.6 \
libstdc++.so.6 \
libvotca-csg.so.2022 \
libvotca-tools.so.2022 \
libvotca-xtp.so.2022"

inherit rpm
