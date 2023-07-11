SUMMARY = "Development files for aria2"
DESCRIPTION = "aria2 is a utility for downloading files. It has a segmented \
downloading engine in its core. It can download one file from \
multiple URLs or multiple connections from one URL. This can be used \
to speed up downloads with certain networks. The engine in was \
implemented in a single-thread model. \
 \
This package contains development files for its shared library."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "aria2-devel-1.36.0-1.12.aarch64.rpm"
RPM_HASH = "c7e25e936b1256d56c39285fb56bfbe78204a439eb5ba468d70d8fb1669df44cbd19926b8d8c5d4934eb8a25d29649d379d72bd0061c5397c4748ea4418e8dbb"

RPROVIDES:${PN} += "aria2-devel \
pkgconfig-libaria2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaria2-0"

inherit rpm
