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

RPM_NAME = "blobAndConquer-1.11-2.24.aarch64.rpm"
RPM_HASH = "f333df3f44b5f3aa19df41b139efdddf4c54286879772d4958b032b8cb7bcde504b7eae3224602495ba5a99e75580d38b13089627694135a9f488bf2f0ace77e"

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
