SUMMARY = "High Dynamic Range Image and Video manipulation tools"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "658e7d878cf567df3f88ee4745df95b5c45656aa9162446713872ec0f8461f45ef73506a4ce0c3e9d4d98dc47e9d7344ab2cd85fd7e33cb889a02ca3119481d0"

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
