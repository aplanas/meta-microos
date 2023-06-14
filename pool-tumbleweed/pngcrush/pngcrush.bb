SUMMARY = "Optimizer for PNG Files that can also insert or delete specified Chunks"
DESCRIPTION = "pngcrush is an excellent batch-mode compression utility for PNG \
images. Depending on the application that created the original PNGs, it can \
improve the file size anywhere from a few percent to 40% or more (completely \
losslessly). The utility also allows specified PNG chunks (e.g. text comments) \
to be inserted or deleted, and it can fix incorrect gamma info written by \
Photoshop 5.0 as well as the erroneous iCCP chunk written by Photoshop 5.5."
LICENSE = "Zlib"

PV = "1.8.13"

RPM_NAME = "pngcrush-1.8.13-1.26.aarch64.rpm"
RPM_HASH = "9aa0fde43e2c6fc31b1c3d5b8efdf6d02bf047bec94a263b80821a60cd25d9de5ade0e3e27447791b3b6c8a5dda36883466966f9886d60c7363a152d6db2b506"

RPROVIDES:${PN} += "pngcrush"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
