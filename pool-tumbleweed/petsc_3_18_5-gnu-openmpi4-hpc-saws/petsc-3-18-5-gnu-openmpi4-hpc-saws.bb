SUMMARY = "PETsc SAWs infrastructure"
DESCRIPTION = "This package contains the files to interface with SAWs \
(Scientific Application Web server). SAWs itself is not \
yet supported by openSUSE."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi4-hpc-saws-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "83c711dbbcb675eafc8e2eedf3f8602be8f221d10758850562d214d5fcf50065261d38d6a7f1c314d83297dede86080faae169e8b2baadc3ca6976394e433f89"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi4-hpc-saws"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
libpetsc-3-18-5-gnu-openmpi4-hpc"

inherit rpm
