SUMMARY = "Versatile Object-oriented Toolkit for Coarse-graining Applications"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-2022.1-3.6.aarch64.rpm"
RPM_HASH = "f985c18851fde7180e4f569a3cd5b05994c60b7adb3a292d0d4607ac302e023e8e5c8025123b5eca60ad7b30b3af06f1e44164d8be7e0b689908c7497336d3b6"

RPROVIDES:${PN} += "votca \
votca(aarch-64) \
votca-csg \
votca-csg-apps \
votca-tools \
votca-xtp"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libvotca_csg.so.2022()(64bit) \
libvotca_tools.so.2022()(64bit) \
libvotca_xtp.so.2022()(64bit)"

inherit rpm
