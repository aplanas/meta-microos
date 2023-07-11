SUMMARY = "Development files for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel package contains the libraries and header files \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-devel-3.5-1.5.aarch64.rpm"
RPM_HASH = "d7987adcace1ddb14ff3a2f4ef7e828b36b471a53eb017a83f232495d785119d35866b2735a4e24cab6a3b978cae24b78fa300715756d40f31b221b27c63bfad"

RPROVIDES:${PN} += "libsepol-devel \
pkgconfig-libsepol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsepol2"

inherit rpm
