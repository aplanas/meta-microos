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

RPROVIDES:${PN} += "libvotca2022 \
libvotca2022(aarch-64) \
libvotca_csg.so.2022()(64bit) \
libvotca_csg2022 \
libvotca_tools.so.2022()(64bit) \
libvotca_tools2022 \
libvotca_xtp.so.2022()(64bit) \
libvotca_xtp2022"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_program_options.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libecpint.so.1()(64bit) \
libexpat.so.1()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libgromacs.so.8()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libint2.so.2()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxc.so.12()(64bit)"

inherit rpm
