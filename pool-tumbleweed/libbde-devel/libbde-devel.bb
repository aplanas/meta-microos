SUMMARY = "Development files for libbde, used to access Bitlocker Drive Encrypted Volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbde."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "libbde-devel-20221031-3.12.aarch64.rpm"
RPM_HASH = "6d5ac9314ad01e26251ff44dcdf7ad1f1d7ba428d94d4948be8b991f9fe7f0c14be78d705edf23ce8abdfe89a8b9251a9741eb9a35d62e3f6146d48bdf594aa9"

RPROVIDES:${PN} += "libbde-devel \
pkgconfig-libbde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbde1 \
libbfio-devel"

inherit rpm
