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

RPM_NAME = "gdcm-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "cad33eaa16a071710ffa91ad1f14622e4a320d4af64dcd24f4b22e616822d7f88f5b340a152d6bce1373294b37c556d925e0bf1e01772d30b85f7de45857481e"

RPROVIDES:${PN} += "gdcm"

RDEPENDS:${PN} += ""

inherit rpm
