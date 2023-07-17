SUMMARY = "Development files for libbde, used to access Bitlocker Drive Encrypted Volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbde."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "libbde-devel-20221031-3.13.aarch64.rpm"
RPM_HASH = "b165cb2c205b0805d097009f3d7c81a1fe7120ade6aa9c39099e8c472a485e978d4a786e2061a3ada861781d4ca26a6c16b2b2c1c8c7fadb551d64535005232d"

RPROVIDES:${PN} += "libbde-devel \
pkgconfig-libbde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbde1 \
libbfio-devel"

inherit rpm
