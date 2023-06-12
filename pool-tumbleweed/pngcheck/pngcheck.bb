SUMMARY = "PNG file format checker"
DESCRIPTION = "pngcheck verifies the integrity of PNG, JNG and MNG files (by checking the \
internal 32-bit CRCs or checksums) and optionally dumps almost all of the \
chunk-level information in the image in human-readable form. For example, it \
can be used to print the basic stats about an image (dimensions, bit depth, \
etc.); to list the color and transparency info in its palette; or to extract \
the embedded text annotations. All PNG and JNG chunks are supported, plus \
almost all MNG chunks (everything but PAST, DISC, tERm, DROP, DBYK, and \
ORDR). This is a command-line program with batch capabilities (e.g., \
``pngcheck *.png'')."
LICENSE = "GPL-2.0-or-later & HPND"

PV = "3.0.3"

RPM_NAME = "pngcheck-3.0.3-1.8.aarch64.rpm"
RPM_HASH = "43cbb9eef2234dfe55afa85b9aef8c9fa7cf965793b285903b565401495166949bca04fe5b4b29a477529c1526f0e76d5c7092e3ac0cd70055d4d2a4eb8eacf8"

RPROVIDES:${PN} += "pngcheck \
pngcheck(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
