SUMMARY = "For Distributed Compile in the Network"
DESCRIPTION = "icecream is the next generation distcc."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libicecream-devel-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "22d3b6236834a2600dc3fec3b3b10d2288fb5621dd09d8c2a76f1a915a4a948ff3052a493b11b03be4d36a8d54627b551ed8180d438027592bb67deed0def9f0"

RPROVIDES:${PN} += "libicecream-devel \
pkgconfig-icecc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarchive-devel \
libcap-ng-devel \
libstdc++-devel \
libzstd-devel \
lzo-devel"

inherit rpm
