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

RPM_NAME = "gdcm-3.0.21-1.4.aarch64.rpm"
RPM_HASH = "bdc2c30561133eb487248ef8fafeb489a5183f79b5c39ce5faee70715d37d75b5ee7d296950582a90cbb6078d3bb642fe12c8d54ece323c708a6685808e49e4a"

RPROVIDES:${PN} += "gdcm gdcm(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
