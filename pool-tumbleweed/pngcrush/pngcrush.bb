SUMMARY = "Optimizer for PNG Files that can also insert or delete specified Chunks"
DESCRIPTION = "pngcrush is an excellent batch-mode compression utility for PNG \
images. Depending on the application that created the original PNGs, it can \
improve the file size anywhere from a few percent to 40% or more (completely \
losslessly). The utility also allows specified PNG chunks (e.g. text comments) \
to be inserted or deleted, and it can fix incorrect gamma info written by \
Photoshop 5.0 as well as the erroneous iCCP chunk written by Photoshop 5.5."
LICENSE = "Zlib"

PV = "1.8.13"

RPM_NAME = "pngcrush-1.8.13-1.27.aarch64.rpm"
RPM_HASH = "dbfaf09fe6cfcf96a9672f307fb33231b567182297bd766310b98b37709dd0e88948214267b05c2bb58a948ad1cfbf5d428fa02b0f8b9c7c25ec67927c7e8b9e"

RPROVIDES:${PN} += "pngcrush"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
