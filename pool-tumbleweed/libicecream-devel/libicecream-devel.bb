SUMMARY = "For Distributed Compile in the Network"
DESCRIPTION = "icecream is the next generation distcc."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "libicecream-devel-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "e2dc507d1f48a911b95a8850532ccc67d0aefd805d5359fd18432c21b7205dcb6f15e9598aa2ded24128f0baf72539d245578f461434f97ae90b658f6e3d73d3"

RPROVIDES:${PN} += "libicecream-devel \
libicecream-devel(aarch-64) \
pkgconfig(icecc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarchive-devel \
libcap-ng-devel \
libstdc++-devel \
libzstd-devel \
lzo-devel"

inherit rpm
