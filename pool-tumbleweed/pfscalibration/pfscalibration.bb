SUMMARY = "Photometric Calibration of HDR and LDR Cameras"
DESCRIPTION = "A photographic camera with a standard CCD sensor is able to acquire an \
image with simultaneous dynamic range of not more than 1:1000. The \
basic idea to create an image with a higher dynamic range is to combine \
multiple images with different exposure settings, thus making use of \
available sequential dynamic range."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfscalibration-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "a68ffcf23e87c064cdd744b6391c13cde44bedf3939edb78d4df0dcfc2a63249afdb83c9dda4fcb331f8040c942607067dbd51568167ec6c912cff0f7f543f0c"

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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
