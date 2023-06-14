SUMMARY = "Command line programs for GDCM"
DESCRIPTION = "This package includes tools to convert, anonymize, manipulate, \
concatenate, and view DICOM files."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-applications-3.0.21-1.5.aarch64.rpm"
RPM_HASH = "8033574b60f39eb5533fb291e255cf300a79249c84c88f84165b75e0ac13c3fa815486a27576c7e3eda6a6cb8b8383f610a5293eae0a2d4c92d33eca46499266"

RPROVIDES:${PN} += "gdcm-applications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdcm3-0 \
libgdcmCommon.so.3.0 \
libgdcmDICT.so.3.0 \
libgdcmDSED.so.3.0 \
libgdcmIOD.so.3.0 \
libgdcmMEXD.so.3.0 \
libgdcmMSFF.so.3.0 \
libpoppler.so.128 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
