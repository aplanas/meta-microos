SUMMARY = "Library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libpfs2-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "c7b937bc289564070c6c36d28d5ab83e31611e387e6daf8d79a33d8a1c82b35fbfa50180d420f0b76a155b102abfdc4ed8b3291ed92cd070fa539a5612cafb15"

RPROVIDES:${PN} += "libpfs.so.2 \
libpfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
