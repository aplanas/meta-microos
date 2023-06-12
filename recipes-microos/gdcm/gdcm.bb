SUMMARY = "C++ library to parse DICOM medical files"
DESCRIPTION = "Grassroots DiCoM (GDCM) is a C++ library for parsing DICOM medical files. \
It supports ACR-NEMA version 1 and 2 (huffman compression is not supported), \
RAW, JPEG, JPEG 2000, JPEG-LS, RLE and deflated transfer syntax. \
It comes with a scanner implementation to scan DICOM files. \
It supports SCU network operations (C-ECHO, C-FIND, C-STORE, \
C-MOVE). PS 3.3 & 3.6 are distributed as XML files. \
It also provides PS 3.15 certificates and password based mechanism to \
anonymize and de-identify DICOM datasets."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "1b017dd81f05ab0369565049025c4f7ce852c25a8a6e7a217eb6b50de62f74452b6b232b9e17a5520d3ca4245860301b712c00a12fd5561193319bd9cc840d81"

RPROVIDES:${PN} += "gdcm \
gdcm(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
