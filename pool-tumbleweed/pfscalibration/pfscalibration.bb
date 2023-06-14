SUMMARY = "Photometric Calibration of HDR and LDR Cameras"
DESCRIPTION = "A photographic camera with a standard CCD sensor is able to acquire an \
image with simultaneous dynamic range of not more than 1:1000. The \
basic idea to create an image with a higher dynamic range is to combine \
multiple images with different exposure settings, thus making use of \
available sequential dynamic range."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfscalibration-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "4db6cb5a9170abb6c6bba98452c2cbfce0d50dc1eb0c7178f4fb4f768f2740c3d362bfc3f7a0932e7ad81ea5f8175f1eb827220aa5eec897891f0122a6aaf96c"

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
perl--MODULE-COMPAT-5.36.0"

inherit rpm
