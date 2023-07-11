SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GNU Ocrad is an OCR (Optical Character Recognition) program based on a feature \
extraction method. It reads images in pbm (bitmap), pgm (greyscale) or ppm \
(color) formats and produces text in byte (8-bit) or UTF-8 formats. \
 \
Also includes a layout analyser able to separate the columns or blocks of text \
normally found on printed pages. \
 \
Ocrad can be used as a stand-alone console application, or as a backend to \
other programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "ocrad-0.28-1.8.aarch64.rpm"
RPM_HASH = "9ed95e33ac1ec2fdad980e900f682c95e45ce2c8230f39225ce61fb1a142b1b6fcd0b2dc84e545c5b38edc3230e8049b33c66b0753bc780e653730a4ab7002f4"

RPROVIDES:${PN} += "ocrad"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
