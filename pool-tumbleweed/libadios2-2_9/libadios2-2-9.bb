SUMMARY = "The Adaptable IO System (ADIOS2) run-time libraries"
DESCRIPTION = "ADIOS2: The Adaptable Input Output (I/O) System version 2  is an open-source \
framework that addresses scientific data management challenges. \
 \
This package provides the shared libraries for ADIOS2."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "libadios2-2_9-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "ea5dba1cb9c2252bbbe411b51d92ca575afcc0f8a5b9aec0695b143c6670fb4c61b3fa8f758b60cc86162d2f82d53be204b772ddf7b6c733a34b9f918bea6746"

RPROVIDES:${PN} += "adios2 \
libadios2-2-9 \
libadios2-atl.so.2.9 \
libadios2-c.so.2.9 \
libadios2-cmenet.so \
libadios2-cmepoll.so \
libadios2-cmmulticast.so \
libadios2-cmselect.so \
libadios2-cmsockets.so \
libadios2-cmudp.so \
libadios2-cmzplenet.so \
libadios2-core.so.2.9 \
libadios2-cxx11.so.2.9 \
libadios2-dill.so.2.9 \
libadios2-enet.so.2.9 \
libadios2-evpath.so.2.9 \
libadios2-ffs.so.2.9 \
libadios2-fortran.so.2.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
