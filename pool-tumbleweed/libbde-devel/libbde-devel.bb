SUMMARY = "Development files for libbde, used to access Bitlocker Drive Encrypted Volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbde."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "libbde-devel-20221031-4.1.aarch64.rpm"
RPM_HASH = "78e9246167d96fd533b7f8cd107c38e40acec581a54b6fbee0ded8c624f0f540551173a229841a3feda8a7d91f987783c4a1e1e8821e0596a946fbbbadabdc7c"

RPROVIDES:${PN} += "libbde-devel \
pkgconfig-libbde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbde1 \
libbfio-devel"

inherit rpm
