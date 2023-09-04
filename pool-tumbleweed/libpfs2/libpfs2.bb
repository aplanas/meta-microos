SUMMARY = "Library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libpfs2-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "60af240168a445ce15f243ba76f9763c5152aea6a661d6535ff7e685aa425d3d73f8655626fc1284b784efd4e780aae7b77303045c2c2bf7e3dc68ff84f0e764"

RPROVIDES:${PN} += "libpfs.so.2 \
libpfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
