SUMMARY = "Blob Wars: Blob and Conquer - a 3rd person action game"
DESCRIPTION = "With the apparent defeat of Galdov and the reclaiming of the Fire, \
Time, Space and Reality Crystals the Blobs' battle was only just \
beginning. Bob had rescued many Blobs and fought many battles, \
but now he had an ever bigger task ahead of him. The Blobs' \
homeworld is still littered with the alien forces and Bob once \
again makes it his task to lead the counter attack. But even \
without Galdov the aliens are still extremely well organised... \
 \
They're Ready. Will You Be?"
LICENSE = "GPL-2.0+"

PV = "1.11"

RPM_NAME = "blobAndConquer-1.11-2.23.aarch64.rpm"
RPM_HASH = "2b52c7cba87c4bdc5d4ecd35394d3be3eb17c47259e473a2ed4fdbc0acaf1dee90236994d772bd01174580b0fca0aeaa96d601ba12da5ca105d88bffdf5074f6"

RPROVIDES:${PN} += "blobAndConquer"

RDEPENDS:${PN} += "libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
