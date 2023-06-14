SUMMARY = "Whole Slide Imaging for Orthanc"
DESCRIPTION = "The Orthanc project provides three official tools to support DICOM for whole-slide microscopic imaging (WSI): \
- A so-called “DICOM-izer” command-line tool that converts whole-slide images to DICOM series, following Supplement 145. \
- A plugin that extends Orthanc with a Web viewer of whole-slide images for digital pathology. \
- Another command-line tool that converts a DICOM series stored inside Orthanc, to a standard hierarchical TIFF image."
LICENSE = "AGPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "orthanc-wsi-1.1-2.11.aarch64.rpm"
RPM_HASH = "2c58a3d5ff4656e668c30ef927590abf42cc50d6f384db3f87a6ac7cfb7387818cc5aade91c8d91afd903cd1acb4b05e8edaf76683cee7d567fc6e779250fe47"

RPROVIDES:${PN} += "libOrthancWSI.so.1.1 \
orthanc-wsi"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdcmdata.so.17 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjsoncpp.so.25 \
libofstd.so.17 \
libopenjp2.so.7 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libuuid.so.1 \
libz.so.1 \
orthanc"

inherit rpm
