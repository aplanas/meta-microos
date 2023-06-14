SUMMARY = "RESTful DICOM server for healthcare and medical research"
DESCRIPTION = "Orthanc aims at providing a simple, yet powerful standalone DICOM server. \
Orthanc can turn any computer running Windows or Linux into a DICOM store \
(in other words, a mini-PACS system). Its architecture is lightweight, \
meaning that no complex database administration is required, nor the \
installation of third-party dependencies. What makes Orthanc unique \
is the fact that it provides a RESTful API. Thanks to this major \
feature, it is possible to drive Orthanc from any computer language. \
 \
The DICOM tags of the stored medical images can be downloaded in the \
JSON file format. Furthermore, standard PNG images can be generated \
on-the-fly from the DICOM instances by Orthanc. Orthanc lets its \
users focus on the content of the DICOM files, hiding the complexity \
of the DICOM format and of the DICOM protocol."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.0"

RPM_NAME = "orthanc-1.12.0-1.2.aarch64.rpm"
RPM_HASH = "a180ab465ebce064a41aadaab27c436b0f2a8dbc5911c3ac06b339e17245e6fef298d455c277b114f0caf3190555584e1d2d5430ae9552dff67a8aca18a6ee90"

RPROVIDES:${PN} += "config-orthanc \
libConnectivityChecks.so.1.12.0 \
libDelayedDeletion.so.1.12.0 \
libHousekeeper.so.1.12.0 \
libModalityWorklists.so.1.12.0 \
libMultitenantDicom.so.1.12.0 \
libServeFolders.so.1.12.0 \
orthanc"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
dcmtk \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcivetweb.so.1.15.0 \
libcrypto.so.3 \
libcurl.so.4 \
libdcmdata.so.17 \
libdcmimage.so.17 \
libdcmjpeg.so.17 \
libdcmjpls.so.17 \
libdcmnet.so.17 \
libdcmtls.so.17 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjsoncpp.so.25 \
liblua5.1.so.5 \
liboflog.so.17 \
libofstd.so.17 \
libpng16.so.16 \
libprotobuf-3.21.12.so \
libpugixml.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
