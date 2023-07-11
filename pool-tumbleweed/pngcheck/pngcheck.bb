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

RPM_NAME = "pngcheck-3.0.3-1.9.aarch64.rpm"
RPM_HASH = "6e82bfbf21acc9c47c7c663d1b015de1d01e38f7adfc07029a03a4640298b8385e3588dc9ecbb36eab5d4c9a72faabbf246624f93612a7b741dcbd809b75e930"

RPROVIDES:${PN} += "pngcheck"

RDEPENDS:${PN} += "libc.so.6 \
libz.so.1"

inherit rpm
