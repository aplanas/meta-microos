SUMMARY = "Development files for libbde, used to access Bitlocker Drive Encrypted Volumes"
DESCRIPTION = "libbde is a library to access the BitLocker Drive Encryption (BDE) \
format. The BDE format is used by Windows, as of Vista, to encrypt \
data on a storage media volume. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libbde."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20221031"

RPM_NAME = "libbde-devel-20221031-3.9.aarch64.rpm"
RPM_HASH = "2297434e726b1967931db992d3d78203b6ddfcbcfc40efca02e42c84d62b31cc2bd4394ec3091509952caeed3f69ce60da1a081115600d3a59fbf56e216faca6"

RPROVIDES:${PN} += "libbde-devel \
libbde-devel(aarch-64) \
pkgconfig(libbde)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbde1 \
libbfio-devel"

inherit rpm
