SUMMARY = "Photometric Calibration of HDR and LDR Cameras"
DESCRIPTION = "A photographic camera with a standard CCD sensor is able to acquire an \
image with simultaneous dynamic range of not more than 1:1000. The \
basic idea to create an image with a higher dynamic range is to combine \
multiple images with different exposure settings, thus making use of \
available sequential dynamic range."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfscalibration-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "c32e65ca060b2540620fef0ebf6cd34f7aaf119d2cc01f4b3f9cb6ad5f58736228f0e643cab08748e642140ce110a0e8453692e86c89ff6b017482bac6d881fa"

RPROVIDES:${PN} += "pfscalibration"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
dcraw \
jhead \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6 \
perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
