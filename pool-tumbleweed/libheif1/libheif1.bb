SUMMARY = "HEIF/AVIF file format decoder and encoder"
DESCRIPTION = "libheif is an ISO/IEC 23008-12:2017 HEIF and AVIF (AV1 Image File Format) file \
format decoder and encoder. \
 \
HEIF and AVIF are new image file formats employing HEVC (H.265) or AV1 image \
coding, respectively, for the best compression ratios currently possible. \
 \
For AVIF libaom, dav1d, or rav1e are used as codecs. HEIF support is not \
provided."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "libheif1-1.16.2-1.2.aarch64.rpm"
RPM_HASH = "73a54b979f3d4df44e06c5a71d616e0663c63f755bdc11d5b043b2b4d9666c053f571272fb6da84ef08f63e5146d8a2953e749e0ea94a65bac158b06f5768269"

RPROVIDES:${PN} += "libheif.so.1 \
libheif1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libdav1d.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libsharpyuv.so.0 \
libstdc++.so.6"

inherit rpm
