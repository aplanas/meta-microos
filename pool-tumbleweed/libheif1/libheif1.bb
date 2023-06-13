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

RPM_NAME = "libheif1-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "a8da3852d9b1523e7e1f2a300aafd5efefad101e8a621fff3e68f443ca1e9daafbd511dd762f2557ba79d4a506179349aff645f099bba49fce1bfa65a72d6a2a"

RPROVIDES:${PN} += "libheif.so.1()(64bit) \
libheif1 \
libheif1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libaom.so.3()(64bit) \
libc.so.6()(64bit) \
libdav1d.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libsharpyuv.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
