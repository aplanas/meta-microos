SUMMARY = "High Dynamic Range Image and Video manipulation tools"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "0b7462b0db717c1d76facd4a802534534cb43a3ca9e4437afc4794a804aea76a935bc717e9e179c4ecb2d49c4d31964ee0eda9804275a0c87250d5ddc795e9f1"

RPROVIDES:${PN} += "pfstools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
dcraw \
ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnetpbm.so.11 \
libpfs.so.2 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
