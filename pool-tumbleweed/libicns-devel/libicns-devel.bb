SUMMARY = "Development files for libicns"
DESCRIPTION = "Libraries and header files for developing applications that use libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns-devel-0.8.1+git20201014-1.10.aarch64.rpm"
RPM_HASH = "9e7890aeabc02399a232809b294761f0f96009b5cf3ab2340f5eaa646739215b3fbbf12514f3905aa450fbc589f3465c3ce11d69ce133dddc3356759cea13b85"

RPROVIDES:${PN} += "libicns-devel \
libicns-devel(aarch-64) \
pkgconfig(libicns)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libicns1"

inherit rpm
