SUMMARY = "Command line programs for GDCM"
DESCRIPTION = "This package includes tools to convert, anonymize, manipulate, \
concatenate, and view DICOM files."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-applications-3.0.21-1.9.aarch64.rpm"
RPM_HASH = "bfd80a20001074596de49efd9b94825a3a2f1862bbad500908edd4b6e968f339ee287949e6a2d1f8407254979801fc9b5eb5d06c609773b3da90c8f358f47f1f"

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
libpoppler.so.130 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
