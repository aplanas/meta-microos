SUMMARY = "VOTCA tools library"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains the librares of VOTCA package."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "libvotca2022-2022.1-3.6.aarch64.rpm"
RPM_HASH = "124847e19eafe5c2e322e0a67727afc64ee8aab12609e12fda888ce34a5213acf3fcbd59885cb9766bf58ed3f36f3bcd840ec7c59cb70880f4f1035e4dc5f622"

RPROVIDES:${PN} += "libvotca-csg.so.2022 \
libvotca-csg2022 \
libvotca-tools.so.2022 \
libvotca-tools2022 \
libvotca-xtp.so.2022 \
libvotca-xtp2022 \
libvotca2022"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libecpint.so.1 \
libexpat.so.1 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgromacs.so.8 \
libhdf5-cpp.so.200 \
libhdf5.so.200 \
libint2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libxc.so.12"

inherit rpm
