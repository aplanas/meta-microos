SUMMARY = "Command line programs for GDCM"
DESCRIPTION = "This package includes tools to convert, anonymize, manipulate, \
concatenate, and view DICOM files."
LICENSE = "BSD-3-Clause"

PV = "3.0.21"

RPM_NAME = "gdcm-applications-3.0.21-1.8.aarch64.rpm"
RPM_HASH = "d389f2d1592d002c34a6241ef4eeac1b1c98efd61eaeac398e041685a127901cc540b50ea6193ff419b11c2088a30ac1d07bb797a61aacedbcd8e1f41db4b41a"

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
libpoppler.so.129 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
