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

RPM_NAME = "libvotca2022-2022.1-3.7.aarch64.rpm"
RPM_HASH = "acaa7a3e2fc3097e8790b4dda1cd541b9b0cb2fd940535d861475bd43c34b03117668909eca1e475c6ba918de410f5d62da98af64fabd9c034ad6ed0f9c23355"

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
