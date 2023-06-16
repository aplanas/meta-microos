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

RPM_NAME = "ocrad-0.28-1.7.aarch64.rpm"
RPM_HASH = "633a78cec63baa59c47ee9a458d539785139bf0a58078363e759fe90d19bba35eb9f27dc824d85658b8a85a8005991b0adb18a9b949b9a568e48d1d7cdc43427"

RPROVIDES:${PN} += "ocrad"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
