SUMMARY = "Development files for ldacBT"
DESCRIPTION = "The ldacBT-devel package contains libraries and header files for \
developing applications that use ldacBT."
LICENSE = "Apache-2.0"

PV = "2.0.2.3"

RPM_NAME = "ldacBT-devel-2.0.2.3-4.10.aarch64.rpm"
RPM_HASH = "30c2ca2bc4e408b7ff2fb1c01529bbbfff87c4836da0c6458e756da1b042b9f6274d43e4b5d78e7a88b06aec3a8e3bf9472bfacb73dfbd3710946944261f2c28"

RPROVIDES:${PN} += "ldacBT-devel \
pkgconfig-ldacBT-abr \
pkgconfig-ldacBT-enc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldac2"

inherit rpm
