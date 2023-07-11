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

RPM_NAME = "gdcm-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "35edad84e1339dccde2d113fdea24bc2006e3a4ef7c7123a20c9492777595c8bb02adabd8572fdc1b825168181c9872347ac09e353fcccfde31d01a62a0c1724"

RPROVIDES:${PN} += "gdcm"

RDEPENDS:${PN} += ""

inherit rpm
